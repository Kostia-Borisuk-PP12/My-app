package com.gmail.kostia2121555;

public class AmountSale {
    public static void main(String[] args) {
        int productNumber = 1;
        String product = "Product";
        String amount = "total";
        String income = "sales";
        int day = 5;
        double profitFirstDay = 2400.25;
        double profitSecondDay = 2500.30;
        double profitThirdDay = 2399.85;
        double profitFourthDay = 2451.60;
        double profitFifthDay = 2401.41;

        double sum = profitFirstDay + profitSecondDay + profitThirdDay + profitFourthDay + profitFifthDay;
        double average = sum / day;

        System.out.println(product + " No " + productNumber + ": smartphone,");
        System.out.printf(amount + " sales for " + day + " days is EUR %.2f,%n", sum);
        System.out.printf(income + " by day is EUR %.2f.%n", average);

        productNumber = 2;
        day = 7;
        profitFirstDay = 1498.00;
        profitSecondDay = 1497.90;
        profitThirdDay = 1498.20;
        profitFourthDay = 1498.10;
        profitFifthDay = 1498.25;
        double profitSixtyDay = 1498.15;
        double profitSevenDay = 1498.25;

        sum = profitFirstDay + profitSecondDay + profitThirdDay + profitFourthDay + profitFifthDay + profitSixtyDay + profitSevenDay;
        average = sum / day;

        System.out.println(product + " No " + productNumber + ": laptop,");
        System.out.printf(amount + " sales for " + day + " days is EUR %.2f,%n", sum);
        System.out.printf(income + " by day is EUR %.2f.%n", average);
    }
}

