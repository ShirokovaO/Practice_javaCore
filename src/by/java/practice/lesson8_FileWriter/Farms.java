package by.java.practice.lesson8_FileWriter;

import java.io.Serializable;

public class Farms implements Serializable {
    private String animal;
    private int amountOfAnimals;

    public Farms(String animal, int amountOfAnimals) {
        this.animal = animal;
        this.amountOfAnimals = amountOfAnimals;
    }

    @Override
    public String toString() {
        return "Farms{" +
                "animal='" + animal + '\'' +
                ", amountOfAnimals=" + amountOfAnimals +
                '}';
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public int getAmountOfAnimals() {
        return amountOfAnimals;
    }

    public void setAmountOfAnimals(int amountOfAnimals) {
        this.amountOfAnimals = amountOfAnimals;
    }
}
