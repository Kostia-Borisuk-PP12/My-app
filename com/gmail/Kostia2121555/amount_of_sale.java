package com.gmail.Kostia2121555;

public class amount_of_sale {
    public static void main(String[] args) {
        int productNumber = 1;
        String product = "Product";
        String amount = "total";
        String income = "sales";
        int day = 5;
        double day1 = 2400.25;
        double day2 = 2500.30;
        double day3 = 2399.85;
        double day4 = 2451.60;
        double day5 = 2401.41;

        double sum = day1 + day2 + day3 + day4 + day5;
        double average = sum / day;

        System.out.println(product + " No " + productNumber + ": smartphone,");
        System.out.printf(amount + " sales for " + day + " days is EUR " + sum + ",%n");
        System.out.printf(income + " by day is EUR " + average + ".%n");

        productNumber = 2;
        day = 7;
        double d1 = 1498.00;
        double d2 = 1497.90;
        double d3 = 1498.20;
        double d4 = 1498.10;
        double d5 = 1498.25;
        double d6 = 1498.15;
        double d7 = 1498.25;

        sum = d1 + d2 + d3 + d4 + d5 + d6 + d7;
        average = sum / day;

        System.out.println(product + " No " + productNumber + ": laptop,");
        System.out.printf(amount + " sales for " + day + " days is EUR " + sum + ",%n");
        System.out.printf(income + " by day is EUR " + average + ".");
    }
}
