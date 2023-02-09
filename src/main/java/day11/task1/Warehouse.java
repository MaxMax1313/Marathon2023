package day11.task1;

public class Warehouse {
     int countPickedOrders;
    int countDeliveredOrders;

    static int delivery;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Количество собранных заказов: " + getCountPickedOrders() + ", Количество доставленных заказов: " + countDeliveredOrders;
    }


}
