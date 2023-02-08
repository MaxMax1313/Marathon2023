package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    Warehouse warehouse;
    int count;



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
        warehouse.countDeliveredOrders+=1;
    }


    @Override
    public void bonus() {
        if(salary>=10000){
            salary+=50000;
        }

    }
}
