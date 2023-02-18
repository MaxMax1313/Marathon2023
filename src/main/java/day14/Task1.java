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
            int [] nums = new int[10];
            int count=0;
            int summ = 0;
            for (String number : numbers) {
                nums[count++] = Integer.parseInt(number);
            }
            if(count<10){try {
                throw  new IOException();
            }
            catch (IOException e){
                System.out.println("Некорректный входной файл");
            }

            }
            else { for (int i = 0; i < nums.length; i++) {
                summ+=nums[i];
            }

                System.out.println(summ);}

        }
        catch (FileNotFoundException e ){
            System.out.println("Файл не найден");
        }




    }
}


