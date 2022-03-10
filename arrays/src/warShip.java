
import java.util.Random;
import java.util.Scanner;

public class warShip {
        public static int EMPTY = 0;
        public static int SHIP = 1;
        public static int DEAD = 2;
        public static int MISS = 3;
        public static final int SIZE = 10;
        public static int MAX_COUNT = 10;

        public static int[][] warField = new int[SIZE][SIZE];

    public static void main(String[] args) {
                             //Освновной массив
        Random random = new Random();
        for (int i = 0; i < MAX_COUNT; i++) {
            int ship1 = random.nextInt(SIZE);
            int ship2 = random.nextInt(SIZE);
            warField[ship1][ship2] = SHIP;
        }
        print();
        // Счетчик проб и кораблей
        int count = 30;
        int hit = 0;
    while(count >= 0){
        System.out.println("У вас осталось попыток " + count);
        System.out.println("Введите координаты для атаки через пробел");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int row = Integer.parseInt(parts[0]) - 1;
        int col = Integer.parseInt(parts[1]) - 1;

        if(warField[row][col] == EMPTY){
            warField[row][col] = MISS;
            print();
            System.out.println("ПРОМАХ!");
        }else if(warField[row][col] == SHIP){
            warField[row][col] = DEAD;
            hit++;
            print();
            System.out.println("КОРАБЛЬ РАЗРУШЕН!");
        }else if(warField[row][col] != EMPTY || warField[row][col] != SHIP){
            System.out.println("Введите другие координаты! эти уже использованы");
        }
        //счет проб и попаданий
        if(count == 0){
            System.out.println("Игра закончена!");
            break;
        }else if(hit == 10){
            System.out.println("Вы подбили все корабли, поздравляем!!");
            break;
        }
        count--;

    }
    }
                            // Вывод массива на экран
    public static void print(){
        for(int i = 0; i < MAX_COUNT; i++){
            for(int j = 0; j < MAX_COUNT; j++){
                System.out.format("%4d",warField[i][j]);
            }
            System.out.println();
        }
    }


}
