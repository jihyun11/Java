package org.example.uml;

import java.util.ArrayList;

public class Bank {

    ArrayList<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public boolean updateUser(User user) {
        return true;
    }

    public boolean deleteUser(String id) {
        return true;
    }

}
