package day11.task1;

public class Warehouse  {
    public int countPickedOrders;
    public int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Количество собранных заказов: " + getCountPickedOrders() + " \n Количество доставленных заказов: " + countDeliveredOrders;
    }


}
