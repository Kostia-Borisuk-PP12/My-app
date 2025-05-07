package com.gmail.kostia2121555;

import java.util.Scanner;

public class NumberSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int method = 0;
        System.out.print("Оберіть метод (1-цикл for, 2-цикл while, 3-цикл do while): ");
        method = scanner.nextInt();

        System.out.print("Введіть кількість рядків: ");
        int number = scanner.nextInt();

        if (method == 1) {
            printWithFor(number);
        } else if (method == 2) {
            printWithWhile(number);
        } else if (method == 3) {
            printWithDoWhile(number);
        } else {
            System.out.println("\nНевірний вибір методу!");
        }

        scanner.close();
    }

    public static void printWithFor(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
            System.out.println(i + ") Num is " + i + ", sum is " + sum);
        }
        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + sum);
    }

    public static void printWithWhile(int number) {
        int sum = 0;
        int i = 1;
        while (i <= number) {
            sum += i;
            System.out.println(i + ") Num is " + i + ", sum is " + sum);
            i++;
        }
        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + sum);
    }

    public static void printWithDoWhile(int number) {
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            System.out.println(i + ") Num is " + i + ", sum is " + sum);
            i++;
        } while (i <= number);
        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + sum);
    }
}


