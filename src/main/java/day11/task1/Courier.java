package day11.task1;

public class Courier implements Worker {
    private int salary;
    private final int FIX_SALARY=100;
    private boolean isPayed;
    Warehouse w;

    Courier(Warehouse w){
        this.w=w;
    }

    public int getSalary() {
        return salary;
    }
    public boolean isPayed() {
        return isPayed;
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
        salary+=FIX_SALARY;
        w.DeliverDone();

    }

    @Override
    public void bonus() {
        if(isPayed){
            System.out.println("Бонус уже был выплачен.");
            return;
        }
        else if(w.getCountDeliveredOrders()>=10000){
            salary+=50000;
            isPayed=true;
        }
        else {
            System.out.println("Бонус пока не доступен.");
        }

    }

    @Override
    public void showInfo() {
        System.out.println(salary);
    }
}
