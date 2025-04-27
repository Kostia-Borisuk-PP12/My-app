package com.gmail.Kostia2121555;

public class amount_of_sale {
    public static void main(String[] args) {
        int productNumber = 1;
        String product = "Product";
        String amount = "total";
        String income = "sales";
        int day = 5;
        double dayprofit1 = 2400.25;
        double dayprofit2 = 2500.30;
        double dayprofit3 = 2399.85;
        double dayprofit4 = 2451.60;
        double dayprofit5 = 2401.41;

        double sum = dayprofit1 + dayprofit2 + dayprofit3 + dayprofit4 + dayprofit5;
        double average = sum / day;

        System.out.println(product + " No " + productNumber + ": smartphone,");
        System.out.printf(amount + " sales for " + day + " days is EUR %.2f,%n", sum);
        System.out.printf(income + " by day is EUR %.2f.%n", average);

        productNumber = 2;
        day = 7;
        dayprofit1 = 1498.00;
        dayprofit2 = 1497.90;
        dayprofit3 = 1498.20;
        dayprofit4 = 1498.10;
        dayprofit5 = 1498.25;
        double dayprofit6 = 1498.15;
        double dayprofit7 = 1498.25;

        sum = dayprofit1 + dayprofit2 + dayprofit3 + dayprofit4 + dayprofit5 + dayprofit6 + dayprofit7;
        average = sum / day;

        System.out.println(product + " No " + productNumber + ": laptop,");
        System.out.printf(amount + " sales for " + day + " days is EUR %.2f,%n", sum);
        System.out.printf(income + " by day is EUR %.2f.%n", average);
    }
}

