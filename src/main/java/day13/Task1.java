package day13;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user2, "Привет");
        user1.sendMessage(user2, "Как дела?");

        user2.sendMessage(user1, "Привет");
        user2.sendMessage(user1, "Все ок");
        user2.sendMessage(user1, "Как сам?");

        user3.sendMessage(user1, "Привет");
        user3.sendMessage(user1, "Куда пропал?");
        user3.sendMessage(user1, "Давно не был в сети");

        user1.sendMessage(user3, "Я сейчас на отдых собираюсь");
        user1.sendMessage(user3, "Еду в азропорт,рейс на Барселону в 19.00");
        user1.sendMessage(user3, "Ты как сам?");

        user3.sendMessage(user1, "Какая Барселона,короновирус же?");

        MessageDatabase.showDialog(user1, user3);
    }
}

class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public String getUsername() {
        return username;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);

    }

    public boolean isSubscribed(User user) {
        for (User myUser : subscriptions) {
            if (myUser.getUsername().equals(user.getUsername()))
                return true;
        }
        return false;

    }

    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);

    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);


    }

    @Override
    public String toString() {
        return username;

    }
}

class Message {
    private User sender;
    private User receiver;
    String text;
    Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
    }


    public Date getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public User getReceiver() {
        return receiver;
    }

    public User getSender() {
        return sender;
    }

    @Override
    public String toString() {
        return "Message{" +
                "FROM: " + sender +
                "TO: " + receiver +
                "ON: " + date + "" + text +
                '}';
    }
}

class MessageDatabase {
    private static List<Message> messsage = new ArrayList<>();


    public static void addNewMessage(User sender, User receiver, String text) {
        messsage.add(new Message(sender, receiver, text));
    }


    public static void showDialog(User u1, User u2) {
        for (Message messages : messsage) {
            if (messages.getSender() == u1 && messages.getReceiver() == u2
                    || messages.getSender() == u2 && messages.getReceiver() == u1) {
                System.out.println(messages.getSender() + ":" + messages.getText());
            }
        }
    }
}
