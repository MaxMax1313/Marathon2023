package day8;

public class Airplane {
    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = 0;

    }
    public static void compareAirplanes(Airplane a, Airplane a1){
        if(a.length> a1.length){
            System.out.println("Длинна первого самолета больше.");
        }
        else if (a1.length> a.length){
            System.out.println("Длинна второго самолета больше.");
        }
        else {
            System.out.println("Длинны самолетов равны.");
        }
    }

    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + " , год выпуска: " + year + " , длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
        ;
    }

    @Override
    public String toString() {
        return "Изготовитель: " +  manufacturer + " , год выпуска: " + year + " , длина: " + length + ", вес: " + weight + ", количество топлива в баке: ";

    }

    public void fillUp(int n) {
        fuel += n;
    }


}
