package day6;


class Motorbike {
    private int year;
    private String color;
    private String model;
    private String name = "мотоцикл";

    public Motorbike(int year, String color, String model) {
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
