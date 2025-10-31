package by.java.practice.lesson5_interface;

public class Refrigerator implements Device, KitchenDevices{
//   4. Создать класс Холодильник. Поля: наименование, марка, стоимость, Boolean isOn (включен). Класс холодильник имплементирует интерфейс Электроприборы. Переопределите метод work так, чтобы методы выводил «Холодильник морозит».

    String name;
    String brand;
    double price;
    boolean isOn;

    public Refrigerator(String name, String brand, double price, boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Холодильник морозит");

    }


    @Override
    public void broken() {
        System.out.println("холодильник ломается");
    }
}
