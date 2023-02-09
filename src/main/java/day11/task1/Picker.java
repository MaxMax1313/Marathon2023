package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    Warehouse warehouse;
    static int Sumsalary;

    @Override
    public String toString() {
        return "Заработная плата УПАКОВЩИКА : " + salary + " Бонус выплачен: " + isPayed;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public Picker(int salary, boolean isPayed, Warehouse warehouse) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }


    @Override
    public void doWork() {
        salary += 80;
        warehouse.countPickedOrders += 1;
        Sumsalary += 80;

    }

    @Override
    public void bonus() {
        if (Sumsalary == 1000000) {
            salary += 70000;
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
