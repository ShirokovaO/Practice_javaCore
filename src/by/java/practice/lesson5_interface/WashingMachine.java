package by.java.practice.lesson5_interface;

public class WashingMachine implements Device, KitchenDevices {
//  5. Создать класс Стиральная машина. Поля наименование, бренд, стоимость, Boolean isOn. Класс стиральная машина имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы метод выводил «Стиральная машина стирает».

    String name;
    String brand;
    double price;
    boolean isOn;

    public WashingMachine(String name, String brand, double price, boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Стиральная машина стирает");
    }

    @Override
    public void start() {
        KitchenDevices.super.start();
    }

    @Override
    public void broken() {
        System.out.println("Стиралка ломается");
    }
}
