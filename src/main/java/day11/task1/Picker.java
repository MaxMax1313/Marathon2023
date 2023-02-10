package day11.task1;

public class Picker implements Worker {

    private int salary;
    private final int FIX_SALARY=80;
    private boolean isPayed;
    Warehouse w;

    Picker(Warehouse w){
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
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary+=FIX_SALARY;
        w.PickerDone();

    }

    @Override
    public void bonus() {
        if(isPayed == true){
            System.out.println("Бонус уже был выплачен.");
        }
        else if(w.getCountPickedOrders()>=10000){
            salary+=70000;
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
