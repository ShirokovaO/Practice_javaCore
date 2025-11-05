package by.java.practice.lesson5_interface;

public class VacuumCleaner implements Device{
//   6. Создать класс Пылесос. Поля наименование, бренд, стоимость, Boolean isOn. Класс Пылесос имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы метод выводил «Пылесос убирает».

    String name;
    String brand;
    double price;
    boolean isOn;

    public VacuumCleaner(String name, String brand, double price, boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Пылесос убирает");
    }

    @Override
    public void start() {
        Device.super.start();
    }
}
