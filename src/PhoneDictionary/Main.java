package PhoneDictionary;
import java.util.*;

public class Main {

   static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public void newContact(){
        System.out.println("Введите логин или нажмите 'end' для заверщения");
        String tName = scan.nextLine();

        if(!tName.equals("end")) {

            System.out.println("Введите номер телефона");
            int tAge = Integer.parseInt(scan.nextLine());
            while (true) {
                System.out.println("Выберите группу для добавления контакта");
                PhoneContacts.printGroups();
                String name = scan.nextLine();
                if (!PhoneContacts.data.containsKey(name)) {
                    System.out.println("такой группы нет, Введите из списка групп");
                }
                PhoneContacts.data.get(name).add(new Contacts(tName, tAge));
                System.out.println("хотите еще добавить контакты y/n?");
                String answer = scan.nextLine();
                if (answer.equals("n")) {
                    break;
                } else if (answer.equals("y")) {
                    newContact();
                }


            }
        }

    }
    public void newGroup () {
        String tempName;
        while (true) {

            System.out.format("Введите название группы\n" + "list Для вывода всех групп\n" + "нажмите 'next' для " +
                    "продолжения или 'end' для окончания работы\n");
            tempName = scan.nextLine();
             if (tempName.equals("end")) {
                PhoneContacts.printGroups();
                PhoneContacts.printMap();

                break;
            }
            if (tempName.equals("list")) {
                PhoneContacts.printGroups();
            } else if (tempName.equals("next")) {
                newContact();
            }
            PhoneContacts.data.put(tempName, new ArrayList<>());

       }
    }
}

