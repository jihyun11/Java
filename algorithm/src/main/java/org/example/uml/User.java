package org.example.uml;

public class User {
    private String id;
    private String pw;
    private String name;
    private String phone;
    private String address;

    public boolean registerUser(String id, String pw, String name, String phone, String address) {
        return true;
    }

    public boolean updateUser(String id, String pw, String name, String phone, String address) {
        return true;
    }

    public boolean deleteUser(String id) {
        return true;
    }

    public boolean searchUser(String id) {
        if (id.equals("hong")) {
            return true;
        } else {
            return false;
        }

    }
}
