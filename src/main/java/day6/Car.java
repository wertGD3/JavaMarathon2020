package day6;

class Car {
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

    public void info() {
        System.out.println("Это мотоцикл");
    }

    int yearDifference(int inputYear) {
        return Math.abs(inputYear - year);
    }
}