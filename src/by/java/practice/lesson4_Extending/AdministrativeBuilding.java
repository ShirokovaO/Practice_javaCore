package by.java.practice.lesson4_Extending;

public class AdministrativeBuilding extends CivilBuilding {
    //1.4 Создать класс Административном здание. Административное здание должно наследоваться от Гражданского здания. Поля, которые можно определить в Административном здании: назначение административного здания (офисное, кинотеатр, спортсооружение),число людей, на которое рассчитано здание.
    private String purposeAdmBuilding;
    private int maxPeople;


    public AdministrativeBuilding(String street, String material, int year) {
        super(street, material, year);
    }
}
