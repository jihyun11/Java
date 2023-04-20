package org.example.uml;

public class HouseInfo {
    private String address = "현대아파트";

    private double price;

    private boolean yesorno = false;

    public boolean 주택등록(String address, double price, boolean yesorno) {
        return true;
    }

    public boolean 주택수정(String address, double price, boolean yesorno) {
        return true;
    }

    public boolean 주택삭제(String address) {
        return true;
    }

    public boolean 주택조회(String address) {
        return true;
    }

    public boolean 대출여부확인(String address) {
        if (address.equals("현대아파트") && yesorno == true) {
            return true;
        } else return false;
    }

    public double getPrice() {
        return price;
    }
}
