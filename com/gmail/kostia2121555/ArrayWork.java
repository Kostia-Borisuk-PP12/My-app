package com.gmail.kostia2121555;

import java.util.Scanner;
import java.util.Random;

public class ArrayWork {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100;
        }

        System.out.print("Array elements: ");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println("\nWhat do you want to see?");
        System.out.println("1 - Sum of all negative numbers");
        System.out.println("2 - Number of even and odd numbers");
        System.out.println("3 - Maximum and minimum elements and their indices");
        System.out.println("4 - Arithmetic mean of numbers after the first negative");
        System.out.print("Enter task number: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            int negativeSum = 0;
            for (int number : array) {
                if (number < 0) {
                    negativeSum += number;
                }
            }
            System.out.println("Sum of all negative numbers: " + negativeSum);
        }
        else if (choice == 2) {
            int evenCount = 0;
            for (int number : array) {
                if (number % 2 == 0) {
                    evenCount++;
                }
            }
            int oddCount = array.length - evenCount;
            System.out.println("Number of even numbers: " + evenCount);
            System.out.println("Number of odd numbers: " + oddCount);
        }
        else if (choice == 3) {
            int maxIndex = 0;
            int minIndex = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[maxIndex]) {
                    maxIndex = i;
                }
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }
            System.out.println("Maximum element: " + array[maxIndex] + ", index: " + maxIndex);
            System.out.println("Minimum element: " + array[minIndex] + ", index: " + minIndex);
        }
        else if (choice == 4) {
            int firstNegativeIndex = -1;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    firstNegativeIndex = i;
                    break;
                }
            }

            if (firstNegativeIndex == -1 || firstNegativeIndex == array.length - 1) {
                System.out.println("No negative numbers or no elements after the first negative.");
            } else {
                int sum = 0;
                int elementsCount = array.length - (firstNegativeIndex + 1);
                for (int i = firstNegativeIndex + 1; i < array.length; i++) {
                    sum += array[i];
                }
                double average = (double) sum / elementsCount;
                System.out.println("Arithmetic mean of numbers after the first negative: " + average);
            }
        }
        else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}


