package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 8;
    public static int[][] colors = new int[SIZE][SIZE];
    public static int[][] rotatedColors = new int[SIZE][SIZE];

    public static void main(String[] args) {
        //Основной массив

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        // Вывод массива на экран
       print(colors);
        System.out.println();
        System.out.println("Введите угол разворота матрицы '90','180','270'");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        switch(x){
            case 90:
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotatedColors[i][j] = colors[SIZE - 1 - j][i];
                    }
                }
                print(rotatedColors);

                System.out.println();
                break;
            case 180:

                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotatedColors[i][j] = colors[SIZE - 1 - i][SIZE - 1 - j];
                    }
                }

                print(rotatedColors);

                System.out.println();
                break;

            case 270:
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotatedColors[i][j] = colors[j][SIZE - 1 - i];
                    }
                }

                print(rotatedColors);

                System.out.println();
                break;
        }



    }

    public static void print(int[][] array) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {

                System.out.format("%4d", array[i][j]);
            }
            System.out.println();
        }
    }
}










