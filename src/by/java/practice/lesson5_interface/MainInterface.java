package by.java.practice.lesson5_interface;

public class MainInterface {
    //7. В классе main cоздайте по паре объектов на основании вышесозданных классов. Создайте в классе main создайте выставку из электроприбров и продемонстрируйте способности каждого электроприбора
    //9.  В классе main сделать выставку только из Кухонной техники. Продемонстрировать спосбоности всех электроприборов в этой выставке.
//10. В классе main сделать выставку кофемашин. Продемонстрировать способности всех кофе машин.
//11. На любой кофемашине вызовете метод start(). После этого переопределите метод start так, чтобы этот метод включал прибор (менял значение Boolean isOn на true.) Выведите результат в консоль
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine("coffee", "varit", 300.55, false);
        CoffeeMachine coffeeMachine1 = new CoffeeMachine("coffeeNew", "varitIMelet", 1000.55, false);
        Refrigerator refrigerator = new Refrigerator("Frige", "bosh", 150.88, false);
        Refrigerator refrigerator1 = new Refrigerator("FrigeNew", "atlant", 50.88, false);
        WashingMachine washingMachine = new WashingMachine("Washer", "indesit", 200.99, false);
        WashingMachine washingMachine1 = new WashingMachine("WasherNew", "zanussi", 200.99, false);
        VacuumCleaner vacuumCleaner = new VacuumCleaner("cleaner", "samsung", 80.99, false);
        VacuumCleaner vacuumCleaner1 = new VacuumCleaner("cleanerNew", "xiaomi", 100.99, false);

        Device[] exhibition = {coffeeMachine1, coffeeMachine, refrigerator, refrigerator1, washingMachine, washingMachine1, vacuumCleaner, vacuumCleaner1};
        for (Device e : exhibition) {
            e.work();
        }

        KitchenDevices[] kitchenDExhibition = {refrigerator, refrigerator1, washingMachine, washingMachine1};
        for (KitchenDevices k : kitchenDExhibition) {
            k.broken();
        }

        CoffeeMachine[] coffeeMachinesExhib = {coffeeMachine1, coffeeMachine};
        for (CoffeeMachine c : coffeeMachinesExhib) {
            c.start();
            c.makeCappuchino();
        }

    }
}
