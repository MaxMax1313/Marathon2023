package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicBand {

    private String name;
    private int year;

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }


    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {


    }


}
