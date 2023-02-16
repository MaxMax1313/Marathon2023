package day13;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {


        User user1 = new User("Max");
        User user2 = new User("Ivan");
        User user3 = new User("Masha");

        user1.sendMessage(user3, "Privet brodyaga");
        user3.sendMessage(user1,"Privet, dolbaeb ");
        user1.sendMessage(user2, "Kak y vas pogoda?");


        user2.sendMessage(user2,"vse ");
        user2.sendMessage(user3,"horosho");

        user3.sendMessage(user1,"Privet, ZAEBAL");
        user3.sendMessage(user1,"Chto delaesh");
        user3.sendMessage(user1,"KAK SAM");





        MessageDatabase.showDialog(user1,user3);


    }
}
