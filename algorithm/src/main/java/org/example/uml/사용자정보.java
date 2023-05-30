package org.example.uml;

public class 사용자정보 {

    private String id;

    public boolean 고객조회(String id) {
        if (id.equals("hong")) { //아이디가 hong과 맞으면 ture 반환
            return true;
        } else {
            return false;
        }
    }
}
