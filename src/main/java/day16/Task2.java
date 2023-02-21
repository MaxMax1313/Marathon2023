package day16;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("C:\\Users\\Max\\Desktop\\JavaMarathon2021\\file1.txt");
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            writer.print(random.nextInt(100)+1 + " ");
        }

        Scanner scanner = new Scanner("file1.txt");


        writer.close();
    }
}
