package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();

        arrayList.add("AUDI");
        arrayList.add("BMW");
        arrayList.add("LADA");
        arrayList.add("Porsche");
        arrayList.add("Peugeot");
        arrayList.add(2,"VOLVO");
        arrayList.remove(0);
        System.out.println(arrayList);

    }
}
