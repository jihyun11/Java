package org.example.uml;

public class Account {

    private String number;
    private double balance = 10000;

    public double deposit(String id, double inMoney) {
        User user = new User();
        boolean checkUser = user.searchUser("hong");

        if (checkUser) {
            this.balance = this.balance + inMoney;
            return this.balance;
        } else {
            return -1;
        }
    }

    public double withdraw(String id, double outMoney) {
        User user = new User();
        boolean checkUser = user.searchUser("hong");

        if (checkUser) {
            this.balance = this.balance - outMoney;
            return this.balance;
        } else {
            return -1;
        }
    }

    public double transfer(String id, String tId, double tMoney) {

        User user = new User();
        boolean checkUser = user.searchUser("hong");

        if(checkUser) {
            Account acc = new Account();
            acc.deposit(tId, tMoney);
            this.withdraw(id, tMoney);
            return this.balance;
        } else {
            return -1;
        }


    }





}
