package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {



    String name;
    int year;

    List<Artists> artists;



    MusicBand(String name, int year, List<Artists> artists) {
        this.name = name;
        this.year = year;
        this.artists = artists;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", artists=" + artists +
                '}';

    }

    public  static void transferMembers(MusicBand musicBand1,MusicBand musicBand2){
        musicBand1.artists.add((Artists) musicBand2.artists);
    }
    public static void print(MusicBand musicBand){
        System.out.println(musicBand.artists);



    }

    public static void main(String[] args) {

        List <Artists> artist =new ArrayList<>();
        artist.add(new Artists("VAlera", 55));
        artist.add(new Artists("VIKTOR TSOY", 70));





        MusicBand musicBand1 = new MusicBand("Nirvana", 1967,artist);
        MusicBand musicBand2 = new MusicBand("KINO", 1980, artist);
        MusicBand musicBand3 = new MusicBand("Wu-tang", 2001, artist);
        MusicBand musicBand4 = new MusicBand("TATU", 2005, artist);
        MusicBand musicBand5 = new MusicBand("AC/DC", 1975, artist);
        MusicBand musicBand6 = new MusicBand("Limp Bizkit", 2003, artist);
        MusicBand musicBand7 = new MusicBand("Led Zeppelin", 1966, artist);
        MusicBand musicBand8 = new MusicBand("Krovostok", 2006, artist);
        MusicBand musicBand9 = new MusicBand("Sector gaza", 1979, artist);
        MusicBand musicBand10 = new MusicBand("DDT", 1970, artist);


        System.out.println(musicBand1);
        transferMembers(musicBand1, musicBand2);
        print(musicBand1);






    }


}
