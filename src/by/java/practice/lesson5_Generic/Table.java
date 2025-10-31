package by.java.practice.lesson5_Generic;

public class Table <N,P> {
    //5. Создать класс стол. Этот класс будет состоять из двух дженериков. Первый дженерик будет отображать инвертарный номер стола(Integer), второй дженерик будет отображать персонажа, который за ним будет сидеть
    //6. Реализовать метод в классе стол, который будет выводить имя персонажа, который сидит за столом.

    private N number;
    private P person;

    public Table(N n, P p) {
        this.number = n;
        this.person = p;
    }

    public String namePerson (){
        String name = "за этим столом сидит " + getPerson().toString();
        return name;
    }

    @Override
    public String toString() {
        return "Table{" +
                "person=" + person +
                '}';
    }

    public P getPerson() {
        return person;
    }
}
