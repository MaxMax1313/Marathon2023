package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(11);

        }
        int count8 = 0;
        int count1 = 0;
        int countchet = 0;
        int countnechet = 0;
        int summa = 0;
        for (int s : array) {
            System.out.print(s + " ");
        }
        System.out.println(array.length);
        for (int s : array) {
            if (s > 8) {
                count8 += 1;
            }
            if (s == 1) {
                count1 += 1;
            }
            if (s % 2 == 0) {
                countchet += 1;
            }
            if (s % 2 != 0) {
                countnechet += 1;
            }
            summa += s;

        }
        System.out.println(count8);
        System.out.println(count1);
        System.out.println(countchet);
        System.out.println(countnechet);
        System.out.println(summa);

    }
}
