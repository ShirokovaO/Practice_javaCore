package by.java.practice.lesson9_Stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MainStream {
    //1. Создать функциональный интерфейс. В этом интерфейсе будет метод, который будет возвращать результат умножения двух чисел.
//Наименование метода: Integer multiplication(int a, int b);
//2. В классе main используя ваш функциональный интерфейс, создате лямбда выражение и посчитайте произведение 5 на 10.
//3. Результат выведите в консоль.
    public static void main(String[] args) {
        Multiplication multiplication = ((a, b) -> {
            return a * b;
        });
        System.out.println(multiplication.multiplication(5, 10));

        stream1();
    }

//Задание №2
//1. Создать класс авто. Поля: id, марка, пробег, год выпуска, максимальная скорость, цена.
//1.1 Создать коллекцию из авто.
//1.2 Найти самую быструю машину.
//1.3 Найти самую медленную машину.
//1.4 Найти самую старую
//1.5 Найти самую новую
//1.6 Найти машины, у которых пробег от 50000 до 100000.
//1.7 Найти самую дорогую машину.
//1.8 Найти самую дешёвую машину.
//1.9 Отсортировать машины по пробегу (по возрастанию и по убыванию
//1.10 Отсортировать машины по стоимости (по возрастанию и по убыванию)
//1.11 Найти машины в диапазоне пробега от 20000 до 100000 и в диапазоне цен от 10000 до 20000.
//1.12 Получить не повторяющиеся значения марок авто (distinct).
//1.13 Найти машину в задданом дипазоне цен, определённой марки, с заданным дипазоном пробега, в заданном диапазон год выпуска. Если таких нет, выбросить своё исключение.

    public static void stream1() {
        Auto car1 = new Auto(11, "BMW", 100000, 2015, 300, 30000);
        Auto car2 = new Auto(12, "Audi", 90000, 2008, 200, 10000);
        Auto car3 = new Auto(13, "Ford", 60000, 2017, 250, 15000);
        Auto car4 = new Auto(14, "Ford", 200000, 2020, 250, 9000);
        Auto car5 = new Auto(15, "Tesla", 190000, 2025, 320, 95000);

        List<Auto> cars = List.of(car1, car2, car3, car4, car5);
        //1.6 Найти машины, у которых пробег от 50000 до 100000.
        List<Auto> list = cars.stream().filter(car -> {
            if (car.getProbeg() > 50000 && car.getProbeg() <= 100000) {
                return true;
            } else return false;
        }).toList();

        List<Auto> list1 = cars.stream().filter(car -> car.getProbeg() > 50000 && car.getProbeg() <= 100000).toList();

        System.out.println(list);

        //1.2 Найти самую быструю машину.
        Optional<Auto> resultCars = cars.stream().max(Comparator.comparing(Auto::getMaxSpeed));
        if (resultCars.isPresent()) {
            System.out.println(resultCars.get());
        }

        //1.12 Получить не повторяющиеся значения марок авто (distinct).
        List<String> carModels = cars.stream().map(car -> {
            return car.getModel();
        }).distinct().toList();
        System.out.println(carModels);

        //1.13 Найти машину в задданом дипазоне цен, определённой марки, с заданным дипазоном пробега, в заданном диапазон год выпуска. Если таких нет, выбросить своё исключение.
        Auto carOne = cars.stream().filter(car -> {
            if (car.getModel().equals("Ford") && car.getMaxSpeed() > 100) {
                return true;
            } else return false;
        }).findFirst().orElseThrow(() -> new CarNotFoundException("такой машины нет"));
        System.out.println(carOne);

    }

}
