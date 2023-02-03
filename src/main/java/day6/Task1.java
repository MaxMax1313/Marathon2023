package day6;

public class Task1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.info();
        c.setCar("bmw","green",1995);
        System.out.println(c.yearDifference(2003));


        Motorbike m = new Motorbike("suzuki","white",1980);
        m.info();
        System.out.println(m.yearDifference(2005));
    }
}
