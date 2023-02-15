package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    MusicBand musicBand;

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List <MusicBand> groupsAfter2000 = new ArrayList<>();
        for(MusicBand s :bands){
            if(s.getYear()>2000){
                groupsAfter2000.add(s);

            }

        }

        return groupsAfter2000;


    }

    public static void main(String[] args) {


        MusicBand musicBand1 = new MusicBand("Nirvana", 1967);
        MusicBand musicBand2 = new MusicBand("KINO", 1980);
        MusicBand musicBand3 = new MusicBand("Wu-tang", 2001);
        MusicBand musicBand4 = new MusicBand("TATU", 2005);
        MusicBand musicBand5 = new MusicBand("AC/DC", 1975);
        MusicBand musicBand6 = new MusicBand("Limp Bizkit", 2003);
        MusicBand musicBand7 = new MusicBand("Led Zeppelin", 1966);
        MusicBand musicBand8 = new MusicBand("Krovostok", 2006);
        MusicBand musicBand9 = new MusicBand("Sector gaza", 1979);
        MusicBand musicBand10 = new MusicBand("DDT", 1970);

        List<MusicBand> array = new ArrayList<>();
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

        Collections.shuffle(array);
        System.out.println(array);
        System.out.println(groupsAfter2000(array));
        System.out.println(array);

    }
}
