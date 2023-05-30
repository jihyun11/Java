package org.example.uml;

public class 예약정보 {
    private String 예약id;
    private String 객실번호;

    public String 예약(String id, String 객실번호) {
        사용자정보 user = new 사용자정보();
        if (user.고객조회(id)) {
            객실정보 room = new 객실정보();
            if (room.객실조회(객실번호)) {
                this.예약id = id + 객실번호;
                this.객실번호 = 객실번호;
                return "예약이 완료되었습니다.";
            } else {
                return "객실조회가 되지 않았습니다.";
            }
        } else {
            return "고객조회가 되지 않았습니다.";
        }
    }
}
