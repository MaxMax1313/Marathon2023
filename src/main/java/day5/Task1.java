package day5;

public class Task1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.setCar("BMW","Black",1997);
        c.getCar();

    }
}

class Car{
    private String model;
    private String color;
    private int year;
    void setCar(String model, String color, int year){
        this.model=model;
        this.color=color;
        this.year=year;
    }
    void getCar(){
        System.out.println("Модель автомобиля: " + model);
        System.out.println("Цвет автомобиля: " + color);
        System.out.println("Год выпуска автомобиля: " + year);
    }


}
