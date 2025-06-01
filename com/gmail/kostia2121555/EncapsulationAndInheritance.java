package com.gmail.kostia2121555;

public class EncapsulationAndInheritance {
    public static void main(String[] args) {
        Employee emp = new Employee("Іван Іванов", "Менеджер", "ivan@example.com", "+380123456789", 35);
        System.out.println("Інформація про співробітника:");
        System.out.println("ПІБ: " + emp.getFullName());
        System.out.println("Посада: " + emp.getPosition());
        System.out.println("Email: " + emp.getEmail());
        System.out.println("Телефон: " + emp.getPhone());
        System.out.println("Вік: " + emp.getAge());

        Car car = new Car();
        System.out.println("\nЗапуск автомобіля:");
        car.start();
    }
}

class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }
}

class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Машина заведена.");
    }

    private void startElectricity() {
        System.out.println("Електросистема активована.");
    }

    private void startCommand() {
        System.out.println("Команда запуску виконана.");
    }

    private void startFuelSystem() {
        System.out.println("Паливна система активована.");
    }
}

