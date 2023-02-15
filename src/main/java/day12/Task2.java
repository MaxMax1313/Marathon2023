package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List <Integer> array = new ArrayList<>();
        arraySORT(0,30,array);
        System.out.println(array);

    }

    public  static void arraySORT(int a, int b, List<Integer> array){
        for (int i = a; i < b+1; i+=2) {
            array.add(i);
            if(i>=b){
                for (int j = 300; j < 351; j+=2) {
                    array.add(j);
                }
            }
        }
        
    }
}
