package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane air1 = new Airplane("airbass", 2012, 42, 4);
        Airplane air2 = new Airplane("boing", 2011, 40, 5);
        air1.getLength();
        air2.getLength();
        Airplane.compareAirplanes(air1, air2);
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

        public int getLength() {
            return length;
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

        public static void compareAirplanes(Airplane a, Airplane b) {
            if (a.getLength() > b.getLength()) {
                System.out.println("Air1 длиннее air2");
            } else if (a.getLength() < b.getLength()) {
                System.out.println("Air2 длиннее air1");
            } else {
                System.out.println("Air1 и air2 одинаковы по длине");
            }
        }
    }
}

