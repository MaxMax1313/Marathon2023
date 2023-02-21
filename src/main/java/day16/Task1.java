package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {

    public static void printResult(File file) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("файл не найден.");
            ;
        }


        String line = scanner.nextLine();
        String[] array = line.split(" ");
        int count = 0;
        int summ = 0;

        for (String s : array) {
            summ += Integer.parseInt(s);
            count++;

        }
        float d = summ / (float) count;
        System.out.println(d);
    }

    public static void main(String[] args) {
        File file = new File("Test10.txt");
        printResult(file);
    }
}

