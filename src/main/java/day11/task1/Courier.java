package day11.task1;

public class Courier implements Worker {
    private int salary;
    private int isPayed;
    Warehouse warehouse;


    public int getSalary() {
        return salary;
    }

    public int getIsPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Заработная плата КУРЬЕРА : " + salary + " Бонус выплачен: " + isPayed;
    }

    public Courier(int salary, int isPayed, Warehouse warehouse) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.countDeliveredOrders+=1;
    }

    @Override
    public void bonus() {

    }
}
