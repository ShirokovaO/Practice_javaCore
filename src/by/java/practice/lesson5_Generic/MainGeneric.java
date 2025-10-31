package by.java.practice.lesson5_Generic;

public class MainGeneric {
    public static void main(String[] args) {
//        1. Создать класс Персонаж. Поля Имя, фамилия.
//2. Создать класс Студент. Поля факультет
//3. Создать класс Сотрудник. Поля, зарплата

//5. Создать класс стол. Этот класс будет состоять из двух дженериков. Первый дженерик будет отображать инвертарный номер стола(Integer), второй дженерик будет отображать персонажа, который за ним будет сидеть
//6. Реализовать метод в классе стол, который будет выводить имя персонажа, который сидит за столом.
//7. В классе main Создать три стола, за которыми будут сидеть студент и сотрудник.
//8. Вывести поочередно  имена персонажей, которые сидят за столом.
        Person student = new Student("Иван", "Петров", "экономический");
        Person employee = new Employee("Петр", "Иванов", 200);
        Person student1 = new Student("Василий", "Теркин", "биологический");
        Table<Integer, Person> table1 = new Table<>(1, student);
        Table<Integer, Person> table2 = new Table<>(2, employee);
        Table<Integer, Person> table3 = new Table<>(3, student1);

        System.out.println(table1.namePerson());
        System.out.println(table2.namePerson());
        System.out.println(table3.namePerson());



    }
}
