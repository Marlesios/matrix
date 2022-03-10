package MissedCalls;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class PhoneContacts {
    private Map<String,ArrayList<Contacts>> data = new HashMap<>();
    Scanner scan = new Scanner(System.in);

    public String newGroup(){
        String tGroup;
        while(true) {
            System.out.println("Введите название группы или\n 'list' для вывода всех групп\n 'next' для продолжения\n " +
                    "'end' для окончания программы");
            tGroup = scan.nextLine();
            if(tGroup.equals("end")){
                printMap();
                break;
            }if(tGroup.equals("next")){
                newContact();
            }if(tGroup.equals("list")){
                printGroup();
            }data.put(tGroup,new ArrayList<>());
        }return tGroup;

    }

    public Contacts newContact(){
        String name;
        int number = 0;
        System.out.println("Введите имя контакта или 'end' для окончания работы");
        name = scan.nextLine();
        if(name.equals("end")) {
            printMap();
        }else {
            System.out.println("Введите номер телефона");
            number = Integer.parseInt(scan.nextLine());
            while (true) {
                System.out.println("выберите группу для добавления");
                printGroup();
                String group = scan.nextLine();
                if (!data.containsKey(group)) {
                    break;
                }
                data.get(group).add(new Contacts(name, number));
                System.out.println("чтобы добавить новые контакты нажмите 'y', чтоб добавить новую группу " +
                        "нажмите 'next', что бы окончить работу нажмите 'end'");
                String answer = scan.nextLine();
                if (answer.equals("end")) {
                    printMap();
                    break;
                }
                if (answer.equals("y")) {
                    newContact();
                }
                if (answer.equals("next")) {
                    newGroup();
                }

            }
        }
                return new Contacts(name, number);
        }





    public void printGroup(){
        for(String key: data.keySet()){
            System.out.println(key + "");
        }
    }
    public void printMap(){
        for(Map.Entry<String,ArrayList<Contacts>> entry: data.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}

