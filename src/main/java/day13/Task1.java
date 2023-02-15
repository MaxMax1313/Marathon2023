package day13;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {


        User user1 = new User("Max");
        User user2 =new User("Ivan");
        System.out.println(user1.getSubscriptions());


        user1.subscribe(user2);
        user2.subscribe(user1);

        System.out.println(user2.isSubscribed(user1));
        System.out.println(user1.isSubscribed(user2));
        System.out.println(user1.isFriend(user2));
        System.out.println(user2.isFriend(user1));





    }
}
