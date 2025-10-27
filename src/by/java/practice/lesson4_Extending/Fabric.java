package by.java.practice.lesson4_Extending;

public class Fabric extends IndustrialBuilding {
    //1.6 Создать класс фабрика. Вопрос: От какого класса должна наследоваться Фабрика. Поля, которые можно определить в Фабрике: количество работников, выпускаемая продукция (запчасти, полиэтилен и т.д.)
    private int workers;
    private String products;

    public Fabric(String street, String material, int year, String industry, int workers, String products){
        super(street, material, year, industry);
        this.workers=workers;
        this.products=products;
    }

    public String info (){
        String info = "количество рабочих: " + workers + " производимая продукция: " + products + super.info();
        return info;
    }




}
