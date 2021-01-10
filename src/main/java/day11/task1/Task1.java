package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        businessProcess(picker);

        System.out.println(picker);
        System.out.println(warehouse);

        businessProcess(courier);

        System.out.println(courier);
        System.out.println(warehouse);
    }

    public static void businessProcess(Worker work) {
        for (int i = 0; i < 10000; i++) {
            work.doWork();
        }
        work.bonus();
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
    private static int money1 = 80;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {

        this.warehouse = warehouse;

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
        salary += money1;
        warehouse.countPiPlus();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10000) {
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
    private static int money = 100;
    private Warehouse Warehouses;

    public Courier(Warehouse Warehouses) {

        this.Warehouses = Warehouses;
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
        salary += money;
        Warehouses.cointDelivPlus();


    }

    @Override
    public void bonus() {

        if (Warehouses.getCountPickedOrders() < 10000) {
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