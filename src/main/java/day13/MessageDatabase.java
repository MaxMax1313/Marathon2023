package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
  private   static List<Message> messages = new ArrayList<>();


    public static void addNewMessage(User u1, User u2, String text) {

        messages.add(new Message(u1,u2,text));


    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
     for(Message s: messages){
         if((s.getSender() == u1 && s.getReceiver()==u2)||(s.getSender() == u2 && s.getReceiver()==u1)) {
             System.out.println(s.getSender() + " : "+ s.getText());
         }
     }
        }

        }


