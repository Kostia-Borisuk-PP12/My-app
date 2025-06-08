package com.gmail.kostia2121555;

public enum EnumPractic {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

interface Advisor {
    void advise(EnumPractic day);
}

class DayAdvisor implements Advisor {
    @Override
    public void advise(EnumPractic day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Порада: складіть список задач, уникайте багатозадачності та робіть перерви для кращої продуктивності.");
                break;
            case FRIDAY:
                System.out.println("Happy Friday! Завершуйте справи і плануйте відпочинок.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Вихідні! Рекомендуємо відвідати парк, музей або просто прогулятися на свіжому повітрі.");
                break;
        }
    }

    public static void main(String[] args) {
        DayAdvisor advisor = new DayAdvisor();

        for (EnumPractic day : EnumPractic.values()) {
            System.out.print(day + ": ");
            advisor.advise(day);
        }
    }
}


