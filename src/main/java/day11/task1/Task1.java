package day11.task1;

public class Task1 {

    static void businessProcess(Worker worker){
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }

    public static void main(String[] args) {
        Warehouse w = new Warehouse();
        Worker worker = new Courier(w);
        Worker worker1 = new Picker(w);
        Worker worker2 = new Picker(w);
        Warehouse w1 = new Warehouse();
        Worker worker3 = new Picker(w1);

        businessProcess(worker1);
        businessProcess(worker);
        businessProcess(worker2);
        businessProcess(worker3);
        worker.showInfo();
        worker1.showInfo();
        worker2.showInfo();
        System.out.println(w);
        System.out.println(w1);
        worker1.bonus();


    }


}
