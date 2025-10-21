package by.java.practice.lesson4_Extending;

public class Building {
    //1.1 Создать класс Постройка (Building). Поля у класса Постройка: улица, материал стен, год постройки.
    private String street;
    private String material;
    private int year;

    public Building(String street, String material, int year) {
        this.street = street;
        this.material = material;
        this.year = year;
    }
    public String info(){
        String info = " улица: " + street + " материал: " + material + " год: " + year;
        return info;
    }



}
