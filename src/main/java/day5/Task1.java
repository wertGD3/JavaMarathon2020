package day5;

public class Task1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setYear(2010);
        myCar.setColor("Black");
        myCar.setModel("Focus");

        System.out.println(myCar.getYear());
        System.out.println(myCar.getColor());
        System.out.println(myCar.getModel());
    }
}
class Car{
    private int year;
    private String color;
    private String model;

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
