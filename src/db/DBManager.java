package db;

import model.User;

import java.util.ArrayList;

public class DBManager {
    public static ArrayList<User> userArrayList = new ArrayList<>();

    static {
        userArrayList.add(new User("Zhansaya", "Kulbaeva"));
        userArrayList.add(new User("Nazar", "Kabylov"));
        userArrayList.add(new User("Zhaksylyk", "Kasymbek"));
        userArrayList.add(new User("Madiyar", "Serik"));
    }

    public static ArrayList<User> getUsers(){
        return userArrayList;
    }

    public static void addUser(User user){
        userArrayList.add(user);
    }
}
