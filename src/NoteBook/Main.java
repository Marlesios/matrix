package NoteBook;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);
        System.out.printf("Выберите действие %n 1. добавить задачу %n 2. Вывести список дел %n 3. Удалить задачу %n 0. Выход %n  ");
        int input = Integer.parseInt(scanner.nextLine());
        switch (input) {
            case 1:
                System.out.println("Введите задачу для планирования");
                tasks.add(scanner.nextLine());
                TaskPrint(tasks);
                break;
            case 2:
       }



    }
    public static void TaskPrint(List<String> task){
        Iterator<String> it = task.iterator();
        while(it.hasNext()){
            String so = it.next();
            System.out.println( so);
        }
    }

}
