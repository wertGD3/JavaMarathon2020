package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }
    
    public static double calculateRedPerimeter(Figure[] figures) {
        double sum = 0;

        for (Figure fig : figures) {

            if (fig.getColor().equals("Red"))
                sum += fig.perimeter();
        }

        return sum;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sum1 = 0;
        for (Figure fig : figures) {
            if (fig.getColor().equals("Red"))
                sum1 += fig.area();
        }
        return sum1;
    }
}

abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double area();

    public abstract double perimeter();
}

class Circle extends Figure {
    private double radius;
    private static final double P = Math.PI;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return P * ((radius) * (radius));
    }

    @Override
    public double perimeter() {
        return 2 * P * radius;
    }
}

class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return (width + height) * 2;
    }
}

class Triangle extends Figure {
    private double length1;
    private double length2;
    private double length3;

    public Triangle(double length1, double length2, double length3, String color) {
        super(color);
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    @Override
    public double area() {
        double g = 0.5 * (length1 + length2 + length3);
        return Math.sqrt(g * (g - length1) * (g - length2) * (g - length3));
    }

    @Override
    public double perimeter() {
        return length1 + length2 + length3;
    }
}
