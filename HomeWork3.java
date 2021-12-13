package folder;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {

    //   public static Scanner scanner = new Scanner(System.in);
//      public static Random random = new Random();

    public static void main(String[] args) {
        onezero();
        massive100(100);
        change();
        closet(7, 7);
        shelf(12, 777);
        minMax();
    }

    //     1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void onezero() {

        int[] arr = new int[8];
        arr[0] = 1;
        arr[1] = 0;
        arr[2] = 0;
        arr[3] = 1;
        arr[4] = 0;
        arr[5] = 0;
        arr[6] = 1;
        arr[7] = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println("\n------------------");
    }

    // 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void massive100(int a) {

        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println("------------------");
    }

    // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void change() {

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println("\n------------------");
    }

    //   4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void closet(int i, int j) {

        int[][] arr = new int[i][j];
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr.length; x++) {
                if (y == x) {
                    arr[y][x] = 1;
                    arr[y][arr.length - 1 - y] = 1;
                }
            }
        }
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr.length; x++) {
                System.out.print(arr[y][x] + "\t ");
            }
            System.out.println();
        }
        System.out.println("------------------");
    }

    //  5. Написать метод, принимающий на вход два аргумента: len и initialValue,
    //  и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static void shelf(int len, int initialValue) {

        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (initialValue);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println("\n------------------");
    }

    // 6. * Задать одномерный массив и найти в нем минимальный и максимальный значения элементов;
    public static void minMax() {

        int[] arr = {5, 89, -4, -56, 70};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min: " + min + " | max: " + max);
        System.out.println("------------------");
    }
}