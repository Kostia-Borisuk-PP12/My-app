package com.gmail.kostia2121555;


class Person {
    private String name;
    private int age;
    private String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }

    public void printInfo() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession);
    }
}

public class ClassAndObjectWork {
    public static void main(String[] args) {
        // Частина 1
        Person person1 = new Person("John", 30, "Інженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");

        person1.printInfo();
        person2.printInfo();
        person3.printInfo();

        System.out.println();

        Person person4 = new Person("Alice", 28, "Архітектор");
        person4.printInfo();

        System.out.println("(Після оновлення професії)");
        person4.setProfession("Дизайнер");
        person4.printInfo();
    }
}


