package by.java.practice.lesson5_interface;

public interface KitchenDevices extends Device {
    //8. Создайте интерфейс Кухонная техника. От этого интерфейса выполните имплементацию у классов Холодильник и Стиральная машина

    @Override
    default void start() {
        Device.super.start();
    }

    void broken();
}
