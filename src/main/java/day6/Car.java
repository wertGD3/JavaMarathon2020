package day6;

class Car {
    private int year;
    private String color;
    private String model;
    private String name = "автомобиль";

    public Car(int year) {
        this.year = year;

    }

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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void info() {
        System.out.println("Это " + getName());
    }

    int yearDifference(int inputYear) {
        return inputYear - year;
    }
}