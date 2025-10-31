package by.java.practice.lesson5_Generic;

public class Person {
    // 1. Создать класс Персона. Поля Имя, фамилия.
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
