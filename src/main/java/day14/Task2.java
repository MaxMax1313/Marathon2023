package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {


    public static List<String> parseFileToStringList(File file) {

        List<String> people = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String s = sc.nextLine();

                String[] person = s.split(" ");
                if (Integer.parseInt(person[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                people.add(s);
            }
            return people;
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");

        }
        return null;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("people.txt");
        System.out.println(parseFileToStringList(file));
    }
}
