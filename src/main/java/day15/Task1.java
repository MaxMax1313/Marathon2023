package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)  {
        File fileout = new File("C:\\Users\\Max\\Desktop\\JavaMarathon2021\\src\\main\\resources\\shoes.csv");
        File filein = new File("day15.txt");
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(filein);
        } catch (FileNotFoundException e) {
            System.out.println("Файл для записи не найден.");;
        }
        List<String> array = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(fileout);
        } catch (FileNotFoundException e) {
            System.out.println("Файл для считывания не найден.");;
        }

        while (scanner.hasNextLine()) {

            String [] list = scanner.nextLine().split(";");
            if (Integer.parseInt(list[2])==0){

               printWriter.println(list[0] + " " + list[1]+ " "+ list[1]);

            }


        }
        printWriter.close();
        scanner.close();




    }


}

