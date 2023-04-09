package org.example.uml;

public class User {
    private String id;
    private String pw;
    private String name;
    private String phone;
    private String address;



    public boolean searchUser(String id) {
        if (id.equals("hong")) {
            return true;
        } else {
            return false;
        }

    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }


}
