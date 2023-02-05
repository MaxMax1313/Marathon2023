package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Player p = new Player(0);
        Player p1 = new Player(rnd.nextInt(50)+10);
        Player p2 = new Player(rnd.nextInt(20)+10);

        Player p4 = new Player(rnd.nextInt(20)+10);
        Player p5= new Player(rnd.nextInt(20)+10);

        Player.info();
        p.run();
        Player.info();








    }
}
