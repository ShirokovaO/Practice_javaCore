package by.java.practice.lesson4_Extending;

public class MultyAppart extends CivilBuilding {
    //1.5 Создать класс Многоквартирный жилой дом. Вопрос: От какого класса должен наследоваться Многоквартирный жилой дом. Поля, которые можно определить в Многоквартирном жилье: количество квартир.
    private int apartments;


    public MultyAppart(String street, String material, int year) {
        super(street, material, year);
    }
}
