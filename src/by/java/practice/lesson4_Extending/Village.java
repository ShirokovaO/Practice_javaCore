package by.java.practice.lesson4_Extending;

public class Village {
    //     1.	Класс Деревня. Деревня будет состоять из построек. К постройкам относятся промышленные здания и гражданские. К промышленным зданиям будут относится заводы и фермы. К гражданским будут относится: административные здания, жилые здания.
    private Building [] buildings = new Building[1];
    //2.1  Создать спортсооружение, исполком, 2 жилых дома, 2 фабрики Значения придумать самим. Добавить эти объекты в деревню (реализовать метод по добавлению постройки в деревню) (должны придумать,как это сделать)


        public void addBuilding(Building building) {

            int count = 0;
            for (int i = 0; i < buildings.length; i++) {
                count++;
            }

            Building[] newBuildings = new Building[count + 1];
            for (int i = 0; i < count; i++) {
                newBuildings[i] = buildings[i];
            }
            newBuildings[count] = building;
            buildings = newBuildings;

        }

//        public void addBuilding (Building building){
//        Building [] newBuilding = new Building[buildings.length + 1];
//        for (int i = 0; i< buildings.length +1; i++){
//            if(buildings [i] == null){
//                newBuilding [i] = building;
//                break;
//            } else
//            newBuilding[i] = buildings[i];
//        }
//        newBuilding [newBuilding.length -1] = building;
//
//        buildings =  newBuilding;
//
//    }

    public void info(){
        for (Building building: buildings){
            if(building != null){
                System.out.println(building.info());
            }
        }
    }

}
