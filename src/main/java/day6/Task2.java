package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane a = new Airplane("Russia",1995,200,5000);
        a.info();
        a.setManufacturer("Brazil");
        a.setYear(2005);
        a.setWeight(150);
        a.setWeight(4500);
        a.fillUp(8000);
        a.info();
        a.fillUp(20000);
        a.info();


    }
}

class Airplane {
    Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer=manufacturer;
        this.year=year;
        this.length=length;
        this.weight=weight;

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

    public void info(){
        System.out.println("Изготовитель: " + manufacturer + " , год выпуска: " + year + " , длина: "  + length+ ", вес: "+weight+ ", количество топлива в баке: "+ fuel);;
    }

    public void fillUp(int n){
        fuel+=n;
    }
}
