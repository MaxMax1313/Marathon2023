package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse w = new Warehouse();
        Courier c = new Courier(0,false, w);

        for (int i = 0; i <100; i++) {
            c.doWork();
        }
        System.out.println(c.getSalary());
        System.out.println(w.countDeliveredOrders);
        c.bonus();
        System.out.println(c.getSalary());

    }
}
