package day6;

public class Task1 {
    public static void main(String[] args) {
        Car myCar = new Car(2015);
        Motorbike myBike = new Motorbike(2015, "Red", "Suzuki");

        myCar.info();
        System.out.println(myCar.yearDifference(2020));

        myBike.info();
        System.out.println(myBike.yearDifference(2018));
    }
}

