package com.gmail.kostia2121555;

import java.util.Scanner;

public class MethodWork {

    public static void printSquare(int number) {
        System.out.println("Квадрат числа: " + (number * number));
    }

    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static String reverseString(String input) {
        char[] chars = input.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }
        return reversed;
    }

    public static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public static void printTextNTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Введіть ціле число: ");
        int number = scanner.nextInt();
        printSquare(number);

        System.out.print("2. Введіть радіус циліндра: ");
        double radius = scanner.nextDouble();
        System.out.print("Введіть висоту циліндра: ");
        double height = scanner.nextDouble();
        double volume = calculateCylinderVolume(radius, height);
        System.out.println("Об’єм циліндра: " + volume);

        System.out.print("3. Скільки елементів буде у масиві? ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введіть елемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int sum = sumArray(array);
        System.out.println("Масив чисел" + array);
        System.out.println("Сума елементів масиву: " + sum);

        System.out.print("4. Введіть рядок: ");
        scanner.nextLine();
        String text = scanner.nextLine();
        String reversed = reverseString(text);
        System.out.println("Реверсований рядок: " + reversed);

        System.out.print("5. Введіть число a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть число b: ");
        int b = scanner.nextInt();
        int powResult = power(a, b);
        System.out.println("Результат" + a + " у степені " + b + " = " + powResult);

        System.out.print("6. Введіть ціле число n: ");
        int n = scanner.nextInt();
        System.out.print("Введіть текстовий рядок: ");
        scanner.nextLine();
        String repeatedText = scanner.nextLine();
        printTextNTimes(n, repeatedText);

        scanner.close();
    }
}

