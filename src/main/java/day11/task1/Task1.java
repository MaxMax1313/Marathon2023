package day11.task1;

public class Task1 {


    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        Worker worker = new Courier(0,false,warehouse);
        Worker worker1 = new Picker(0,false,warehouse);

        businessProcess(worker1);
        businessProcess(worker);

        System.out.println(warehouse);
        worker.showSalary();
        worker1.showSalary();

        Warehouse warehouse1 = new Warehouse();
        Worker worker2 = new Courier(0,false,warehouse1);
        Worker worker3 = new Picker(0,false,warehouse1);
        businessProcess(worker2);
        businessProcess(worker3);
        System.out.println(warehouse);




    }
}
