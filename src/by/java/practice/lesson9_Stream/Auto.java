package by.java.practice.lesson9_Stream;

public class Auto {
    //1. Создать класс авто. Поля: id, марка, пробег, год выпуска, максимальная скорость, цена.
    private int id;
    private String model;
    private int probeg;
    private int dateIssue;
    private int maxSpeed;
    private int price;

    public Auto(int id, String model, int probeg, int dateIssue, int maxSpeed, int price) {
        this.id = id;
        this.model = model;
        this.probeg = probeg;
        this.dateIssue = dateIssue;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", probeg=" + probeg +
                ", dateIssue=" + dateIssue +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProbeg() {
        return probeg;
    }

    public void setProbeg(int probeg) {
        this.probeg = probeg;
    }

    public int getDateIssue() {
        return dateIssue;
    }

    public void setDateIssue(int dateIssue) {
        this.dateIssue = dateIssue;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
