package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static List<Person> parseFileToObjList(File file) {
        List <Person> p = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){

                String line = scanner.nextLine();
                String [] array = line.split(" ");

                if(Integer.parseInt(array[1])<0){
                    throw new IllegalArgumentException();
                }
                Person person = new Person(array[0], Integer.parseInt(array[1]));
                p.add(person);

            }
        return p;



        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
        catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");

        }
        return null;
    }


    public static void main(String[] args) {

    }
}






