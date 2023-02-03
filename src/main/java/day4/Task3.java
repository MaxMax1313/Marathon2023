package day4;

import java.util.Random;

public class Task3 {

    public static void main(String[] args) {

        Random rnd = new Random();
        int[][] array = new int[12][8];


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rnd.nextInt(51);
            }

        }
        int maxSumm = 0;
        int maxIndex = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            int summ = 0;
            for (int j = 0; j < array[i].length; j++) {
                summ += array[i][j];
                System.out.print(array[i][j] + " ");
            }

            System.out.println("СУММА МАССИВА = " + summ);
            if (summ >= maxSumm) {
                maxSumm = summ;
                maxIndex = i;
            }
            System.out.println("Номер массива = " + counter);
            counter += 1;
            System.out.println("СУММА МАКСИМАЛЬНОГО МАССИВА =  " + maxSumm);
            System.out.println("БОЛЬШИЙ ИНДЕКС =  " + maxIndex);
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[maxIndex].length; j++) {
                System.out.print(array[maxIndex][j] + " ");

            }
            break;

        }


    }
}
