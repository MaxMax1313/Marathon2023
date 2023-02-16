package day13;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {


        User user1 = new User("Max");
        User user2 = new User("Ivan");
        User user3 = new User("Masha");

        user1.sendMessage(user2, "Privet brodyaga");
        user1.sendMessage(user2, "Kak y vas pogoda?");
        user2.sendMessage(user1,"Privet, dolbaeb vse horosho");


        MessageDatabase.showDialog(user1,user2);


    }
}
