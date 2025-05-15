package com.gmail.kostia2121555;

import java.util.Random;
import java.util.Scanner;

public class MultiArrayWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Введіть кількість рядків: ");
        int row = scanner.nextInt();
        System.out.print("Введіть кількість стовпців: ");
        int column = scanner.nextInt();

        int[][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = rand.nextInt(50) + 1;
            }
        }

        System.out.println("Матриця:");
        for (int[] rows : matrix) {
            for (int value : rows) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }

        int evenRowSum = 0, oddRowSum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i % 2 == 0) {
                    evenRowSum += matrix[i][j];
                } else {
                    oddRowSum += matrix[i][j];
                }
            }
        }

        long evenColProduct = 1, oddColProduct = 1;
        for (int j = 0; j < column; j++) {
            for (int i = 0; i < row; i++) {
                if (j % 2 == 0) {
                    evenColProduct *= matrix[i][j];
                } else {
                    oddColProduct *= matrix[i][j];
                }
            }
        }

        System.out.println("Сума елементів у парних рядках: " + evenRowSum);
        System.out.println("Сума елементів у непарних рядках: " + oddRowSum);
        System.out.println("Добуток елементів у парних стовпцях: " + evenColProduct);
        System.out.println("Добуток елементів у непарних стовпцях: " + oddColProduct);

        boolean isMagic = isMagicSquare(matrix);
        if (isMagic) {
            System.out.println("Матриця є магічним квадратом.");
        } else {
            System.out.println("Матриця не є магічним квадратом.");
        }
    }

    public static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;
        if (n == 0 || matrix[0].length != n) return false;

        int mainSum = 0;
        for (int j = 0; j < n; j++) {
            mainSum += matrix[0][j];
        }

        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != mainSum) return false;
        }

        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != mainSum) return false;
        }

        int diag1 = 0, diag2 = 0;
        for (int i = 0; i < n; i++) {
            diag1 += matrix[i][i];
            diag2 += matrix[i][n - 1 - i];
        }

        return diag1 == mainSum && diag2 == mainSum;
    }
}

