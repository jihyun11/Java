package org.example.uml;

public class UserInfo {
    private String number = "1234";

    private String name;

    public boolean register(String number, String name) {
        return true;
    }

    public boolean remake(String number, String name) {
        return true;
    }

    public boolean remove(String number) {
        return true;
    }

    public boolean look(String number) {

        if (number.equals("1234")) {
            return true;

        } else return false;
    }

}
