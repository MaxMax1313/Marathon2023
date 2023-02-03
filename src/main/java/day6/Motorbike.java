package day6;


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
    public void info(){
        System.out.println("Это мотоцикл.");

    }
    int yearDifference(int inputYear) {
        return Math.abs(inputYear-year);
    }
}