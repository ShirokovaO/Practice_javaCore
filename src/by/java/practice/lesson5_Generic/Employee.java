package by.java.practice.lesson5_Generic;

public class Employee extends Person {
    //3. Создать класс Сотрудник. Поля, зарплата
    private int salary;

    public Employee(String name, String surname, int salary) {
        super(name, surname);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee " + super.getName();
    }
}
