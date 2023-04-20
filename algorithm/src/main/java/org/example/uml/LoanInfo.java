package org.example.uml;

public class LoanInfo {
    private String id;

    private String number;

    private String address;

    private double dachulmoney;

    private double sangmoney;

    private int dachuldate;

    private int presangday;

    private int sangdate;

    public double dachul(String number, String address, int dachuldate, int presangday) {
        UserInfo userInfo = new UserInfo();
        HouseInfo houseInfo = new HouseInfo();
        double hose = houseInfo.getPrice();


        if (userInfo.look("1234")) {
            if (houseInfo.대출여부확인("현대아파트")) {
                return dachulmoney = hose * 0.6;
            }
        } return -1;

    }

    public double sanghwan(String number, String address, int sangdate) {
        return 0;
    }

    public boolean yeoncheck(int sangdate) {
        return true;
    }
}
