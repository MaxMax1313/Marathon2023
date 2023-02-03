package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane a = new Airplane("Russia",1995,200,5000);
        a.info();
        a.setManufacturer("Brazil");
        a.setYear(2005);
        a.setLength(30);
        a.setWeight(150);
        a.fillUp(8000);
        a.info();
        a.fillUp(20000);
        a.info();
        System.out.println(a.getFuel());
    }
}

