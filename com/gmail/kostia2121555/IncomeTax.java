package com.gmail.kostia2121555;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner profit = new Scanner(System.in);
        System.out.print("Введіть сумму вашого доходу: ");
        double income = profit.nextDouble();
        double tax;
        if (income > 0 & income <=10000) {
            tax = income / 100 * 2.5;
            System.out.println("Сума податку: " + tax);
        }  else if (income > 10000 & income <= 25000) {
            tax = income / 100 * 4.3;
            System.out.println("Сума податку: " + tax);
        } else if (income > 25000){
            tax = income / 100 * 6.7;
            System.out.println("Сума податку: " + tax);
        } else {
            System.out.println("Не буває від'ємного доходу");
        }
    }
}
