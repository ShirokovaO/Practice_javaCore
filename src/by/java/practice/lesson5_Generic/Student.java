package by.java.practice.lesson5_Generic;

public class Student extends Person {
    //2. Создать класс Студент. Поля факультет
    private String faculty;

    public Student(String name, String surname, String faculty) {
        super(name, surname);
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student " + super.getName();
    }
}
