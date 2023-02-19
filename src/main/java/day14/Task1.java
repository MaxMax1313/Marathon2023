package day14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)  {

        File file = new File("Test10.txt");

        try {Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            if(numbers.length!=10){
                throw new IllegalArgumentException();
            }

            int summ = 0;
            for (String number : numbers) {
                summ+=Integer.parseInt(number);
            }
                System.out.println(summ);}


        catch (FileNotFoundException e ){
            System.out.println("Файл не найден");
        }
        catch (IllegalArgumentException e){
            System.out.println("Некоректный входной файл.");
        }




    }
}


