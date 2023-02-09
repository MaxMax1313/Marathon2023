package day11.task1;

public class Courier implements Worker {
    int salary;
    boolean isPayed;
    Warehouse warehouse;
    int count;
    static int Sumsalary;


    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Заработная плата КУРЬЕРА : " + salary + " Бонус выплачен: " + isPayed;
    }

    public Courier(int salary, boolean isPayed, Warehouse warehouse) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.countDeliveredOrders += 1;
        Sumsalary += 100;

    }


    @Override
    public void bonus() {
        if (Sumsalary == 1000000) {
            salary += 50000;
        } else if (Sumsalary < 1000000) {
            System.out.println("Бонус пока не доступен");
        } else {
            System.out.println("Бонус уже был выплачен");
        }

    }

    @Override
    public void showSalary() {
        System.out.println(salary);
    }

    @Override
    public void showSUMsalary() {
        System.out.println(Sumsalary);

    }
}
