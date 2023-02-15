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
        for(Artists s : musicBand1.artists){
            musicBand2.artists.add(s);
        }
        musicBand1.artists.clear();
    }
    public void print1(){
        System.out.println(this.artists);
    }

    public static void main(String[] args) {

        List <Artists> artist =new ArrayList<>();
        artist.add(new Artists("VAlera", 55));
        artist.add(new Artists("VIKTOR TSOY", 70));
         List<Artists> artists1 = new ArrayList<>();
         artists1.add(new Artists("TOPOR", 15));
         artists1.add(new Artists("SUZKI",45));





        MusicBand musicBand1 = new MusicBand("Nirvana", 1967,artist);
        MusicBand musicBand2 = new MusicBand("KINO", 1980, artists1);



        System.out.println(musicBand1);
        System.out.println(musicBand2);
        transferMembers(musicBand1,musicBand2);
        musicBand1.print1();
        musicBand2.print1();








    }


}
