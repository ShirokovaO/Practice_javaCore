package by.java.practice.lesson4_Extending;

public class IndustrialBuilding extends Building {
    //1.3 Создать класс Промышленном здание (IndustrialBuilding). Промышленные здания наследуются от Постройки. Поля которые можно определить в Промышленном здании: отрасль (Отрасль в которой здание задействовано (машиностроительная, легкая промышленность, целлюлозная промышленность, сельское хозяйство)

    private String industry;

    public IndustrialBuilding(String street, String material, int year, String industry){
        super(street, material, year);
        this.industry=industry;
    }

    public String info(){
        String info = " отрасль: " + industry + super.info();
        return info;
    }


    public String getIndustry (){
        return industry;
    }

//    public String setIndustry(){
//        return
//    }





}
