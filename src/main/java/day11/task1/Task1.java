package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse ware = new Warehouse();
        Picker pic = new Picker(ware);
        Courier cour = new Courier(ware);

        businessProcess(pic);

        System.out.println(pic);
        System.out.println(ware);

        businessProcess(cour);

        System.out.println(cour);
        System.out.println(ware);
    }

    public static void businessProcess(Worker wor) {
        for (int i = 0; i < 10000; i++) {
            wor.doWork();
        }
        wor.bonus();
    }
}

class Warehouse {
    private int countPickedOrders = 0;
    private int countDeliveredOrders = 0;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }

    public void countPiPlus() {
        countPickedOrders++;
    }

    public void cointDelivPlus() {
        countDeliveredOrders++;
    }
}

class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private static int ЗП = 80;
    private Warehouse war;

    public Picker(Warehouse warr) {

        this.war = warr;

    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }


    @Override
    public void doWork() {
        salary += ЗП;
        war.countPiPlus();
    }

    @Override
    public void bonus() {
        if (war.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed) {
            System.out.println("Бонуc уже был выплачен");
            return;
        }
        salary += 70000;
        isPayed = true;

    }
}

class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private static int зп1 = 100;
    private Warehouse Wr;

    public Courier(Warehouse Wrr) {

        this.Wr = Wrr;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += зп1;
        Wr.cointDelivPlus();


    }

    @Override
    public void bonus() {

        if (Wr.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed) {
            System.out.println("Бону уже был выплачен");
            return;
        }
        salary += 50000;
        isPayed = true;
    }
}

interface Worker {
    public void doWork();

    public void bonus();
}