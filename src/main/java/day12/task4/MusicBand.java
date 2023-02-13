package day12.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicBand {

    String name;
    int year;
    public List <String> artistsNames;


    MusicBand(String name, int year, List<String>artistsNames) {
        this.name = name;
        this.year = year;
        this.artistsNames = artistsNames;

    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", artistsNames=" + artistsNames +
                '}';
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2){
        List <String>array = new ArrayList<>(musicBand1.artistsNames);
     musicBand1.artistsNames=musicBand2.artistsNames;
        musicBand2.artistsNames = array;



    }

    public static void main(String[] args) {
        List<MusicBand> array = new ArrayList<>();
        List<String> artistsName = new ArrayList<>();
        artistsName.add("VAlera");
        artistsName.add("MAx");

        List <String> artist2 = new ArrayList<>();
        artist2.add("OLOLOL");
        artist2.add("ZOZOZOOZOZ");


        MusicBand musicBand1 = new MusicBand("Nirvana", 1967,artistsName);
        MusicBand musicBand2 = new MusicBand("KINO", 1980,artist2);
        MusicBand musicBand3 = new MusicBand("Wu-tang", 2001,artistsName);
        MusicBand musicBand4 = new MusicBand("TATU", 2005,artistsName);
        MusicBand musicBand5 = new MusicBand("AC/DC", 1975,artistsName);
        MusicBand musicBand6 = new MusicBand("Limp Bizkit", 2003,artistsName);
        MusicBand musicBand7 = new MusicBand("Led Zeppelin", 1966,artistsName);
        MusicBand musicBand8 = new MusicBand("Krovostok", 2006,artistsName);
        MusicBand musicBand9 = new MusicBand("Sector gaza", 1979,artistsName);
        MusicBand musicBand10 = new MusicBand("DDT", 1970,artistsName);


        array.add(musicBand1);
        array.add(musicBand2);
        array.add(musicBand3);
        array.add(musicBand4);
        array.add(musicBand5);
        array.add(musicBand6);
        array.add(musicBand7);
        array.add(musicBand8);
        array.add(musicBand9);
        array.add(musicBand10);


        System.out.println(array);

    transferMembers(musicBand1,musicBand2);

        System.out.println(array);






    }


}
