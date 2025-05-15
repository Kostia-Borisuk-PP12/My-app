package com.gmail.kostia2121555;

import java.util.Random;
import java.util.Scanner;

public class SortArrayWork {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) + 1;
        }

        System.out.println("Початковий масив:");
        printArray(array);

        insertSort(array);

        System.out.println("Відсортований масив:");
        printArray(array);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для пошуку: ");
        int key = scanner.nextInt();

        int index = binarSearch(array, key);
        if (index >= 0) {
            System.out.println("Індекс числа " + key + " у відсортованому масиві: " + index);
        } else {
            System.out.println("Число не знайдено в масиві.");
        }
    }

    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static int binarSearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

