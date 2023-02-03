package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(10000);

        }
        int maxSumm = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int summ = 0;
            for (int j = i; j < i + 3; j++) {
                summ += array[j];
            }
            if (summ > maxSumm) {
                maxSumm = summ;
                maxIndex = i;

            }

        }
        System.out.println(Arrays.toString(array));
        System.out.println(maxSumm);
        System.out.println(maxIndex);


    }
}
