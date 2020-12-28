package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike(2015,"Red","Suzuki");
        System.out.println(bike.getYear());
        System.out.println(bike.getColor());
        System.out.println(bike.getModel());


    }
}
class Motorbike{
    private int year;
    private String color;
    private String model;

    public Motorbike(int year,String color,String model){
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
