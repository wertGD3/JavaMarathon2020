package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane air = new Airplane("boing", 2010, 40, 5);
        air.setYear(2012);
        air.setLength(42);
        air.fillUp(300);
        air.fillUp(350);
        air.info();
    }

    private static class Airplane {
        private String producer;
        private int year;
        private int length;
        private int weight;
        private int fuel = 0;

        public Airplane(String producer, int year, int length, int weight) {
            this.producer = producer;
            this.year = year;
            this.length = length;
            this.weight = weight;
        }

        public void setProducer(String producer) {
            this.producer = producer;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }

        public int getFuel() {
            return fuel;
        }

        private void info() {
            System.out.println("Изготовитель: " + producer + " ,год выпуска: " + year + " ,длина: " + length + " ,вес: " + weight + " ,количество топлива в баке: " + getFuel());
        }

        int fillUp(int n) {
            fuel = +n;
            return fuel;
        }
    }
}
