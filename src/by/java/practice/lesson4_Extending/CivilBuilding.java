package by.java.practice.lesson4_Extending;

public class CivilBuilding extends Building {
    //1.2 Создать класс Гражданские здания (CivilBuilding). Гражданские здания должны наследоваться от класса Постройка. Поля у класса Гражданские здания: назначение (жилье или общественные здания), количество этажей.
    private String purpose;
    private int floors;

    public CivilBuilding(String street, String material, int year) {
        super(street, material, year);
    }
}
