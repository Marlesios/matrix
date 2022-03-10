package Elevator;

import javax.lang.model.type.IntersectionType;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> floors = new ArrayDeque<>();
        while (true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 0) {
                fill(floors,input);
                while (!floors.isEmpty()) {
                    System.out.printf("Этаж %d -> ", floors.poll());
                }
                break;
            } else if(input > 25 || input < 0){
                System.out.println("такого этажа нет в доме");
            }else{
                fill(floors,input);
            }
        }
    }

    public static void fill(Queue<Integer> que, int floor) {
        que.offer(floor);
    }
}
