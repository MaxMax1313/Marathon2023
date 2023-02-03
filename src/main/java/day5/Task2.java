package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike m = new Motorbike("Suzuki", "red", 2008);

        m.getMotorbike();
    }
}


class Motorbike {
    private String model;
    private String color;
    private int year;

    Motorbike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    void getMotorbike() {
        System.out.println("Модель мотоцикла: " + model);
        System.out.println("Цвет мотоцикла: " + color);
        System.out.println("Год выпуска мотоцикла: " + year);
    }

}