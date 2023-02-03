package day6;

public class Car {
    private String model;
    private String color;
    private int year;

    public void setCar(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public void getCar() {
        System.out.println("Модель автомобиля: " + model);
        System.out.println("Цвет автомобиля: " + color);
        System.out.println("Год выпуска автомобиля: " + year);
    }

    public void info() {
        System.out.println("Это автомобиль.");
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int yearDifference(int inputYear) {
       return Math.abs(inputYear-year);
    }
}