package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void sredARFM(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double sum = 0;
        while (scanner.hasNextLine()) {
            sum += Double.parseDouble(scanner.nextLine());
        }
        System.out.println((int)sum);

    }

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("C:\\Users\\Max\\Desktop\\JavaMarathon2021\\file1.txt");
        PrintWriter writer1 = new PrintWriter("C:\\Users\\Max\\Desktop\\JavaMarathon2021\\file2.txt");
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            writer.println(random.nextInt(100));
        }
        writer.close();

        File file = new File("file1.txt");
        Scanner scanner = new Scanner(file);

        int sum = 0;
        int count = 0;
        while (scanner.hasNextLine()) {
            sum += Integer.parseInt(scanner.nextLine());
            count++;

            if (count == 20) {
                writer1.println(sum / 20.0);
                count = 0;
                sum = 0;
            }
        }
        writer1.close();

        File file1 = new File("file2.txt");
        sredARFM(file1);

    }
}
