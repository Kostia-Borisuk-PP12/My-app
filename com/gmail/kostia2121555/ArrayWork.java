package com.gmail.kostia2121555;

import java.util.Scanner;
import java.util.Random;

public class ArrayWork {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100;
        }
        System.out.print("Елементи масиву:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nЩо ви хочете побачити?");
        System.out.println("1 - Сума всіх від'ємних чисел");
        System.out.println("2 - Кількість парних і непарних чисел");
        System.out.println("3 - Найбільший та найменший елементи та їхні індекси");
        System.out.println("4 - Середнє арифметичне чисел після першого від'ємного");
        System.out.print("Введіть номер завдання: ");
        int choice = scanner.nextInt();


        if (choice == 1) {
            int negativeSum = 0;
            for (int num : array) {
                if (num < 0) {
                    negativeSum += num;
                }
            }
            System.out.println("Сума всіх від'ємних чисел: " + negativeSum);
        }


        else if (choice == 2) {
            int evenNum = 0;
            int oddNum = 0;
            for (int num : array) {
                if (num % 2 == 0) {
                    evenNum++;
                } else {
                    oddNum++;
                }
            }
            System.out.println("Кількість парних чисел: " + evenNum);
            System.out.println("Кількість непарних чисел: " + oddNum);
        }


        else if (choice == 3) {
            int maxNum = 0;
            int minNum = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[maxNum]) {
                    maxNum = i;
                }
                if (array[i] < array[minNum]) {
                    minNum = i;
                }
            }
            System.out.println("Найбільший елемент: " + array[maxNum] + ", індекс: " + maxNum);
            System.out.println("Найменший елемент: " + array[minNum] + ", індекс: " + minNum);
        }


        else if (choice == 4) {
            int firstNegativeNum = -1;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    firstNegativeNum = i;
                    break;
                }
            }

            if (firstNegativeNum == -1 || firstNegativeNum == array.length - 1) {
                System.out.println("Немає від'ємних чисел або після першого від'ємного немає елементів.");
            } else {
                int sum = 0;
                int count = 0;
                for (int i = firstNegativeNum + 1; i < array.length; i++) {
                    sum += array[i];
                    count++;
                }
                double average = (double) sum / count;
                System.out.println("Середнє арифметичне чисел після першого від'ємного: " + average);
            }
        }
        else {
            System.out.println("Невірний вибір.");
        }

        scanner.close();
    }
}

