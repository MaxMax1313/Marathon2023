package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int [] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(10001);
        }
        int max = array[0];
        int min = array[0];
        int count0 = 0;
        int summ0=0;
        for(int i:array){
            if(i>max){
                max = i;
            }
            if(i<min){
                min=i;
            }
            if(i%10==0){
                count0+=1;
                summ0+=i;
            }

        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(count0);
        System.out.println(summ0);

    }
}
