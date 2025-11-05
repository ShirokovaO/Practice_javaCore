package by.java.practice.lesson5_interface;

public class CoffeeMachine implements Device{
    String name;
    String function;
    double price;
    boolean isOn;

    public CoffeeMachine(String name, String function, double price, boolean isOn) {
        this.name = name;
        this.function = function;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Кофемашина варит кофе");
    }

    @Override
    public void start() {
        isOn = true;
        System.out.println("кофемашина стартует " + isOn);
    }

//    3. Создать класс Кофемашина. Поля наименование. Список функционала. Стоимость, Boolean isOn (включен) Класс кофемашина имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы методы выводил «Кофемашина варит кофе».
    public void makeCappuchino(){
        System.out.println("Кофемашина " + name + " варит капуччино");
    }


}
