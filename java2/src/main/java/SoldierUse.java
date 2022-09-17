import java.util.ArrayList;

public class SoldierUse {
    public static void main(String[] args) {
        Soldier sd = new Soldier("jihyun", 23, "소령");
        sd.soldierinfo();

        ArrayList<Soldier> list = new ArrayList<Soldier>();
        // list.add(sd);
        Soldier sl = new Soldier("hi", 1, "hi");
        Soldier se = new Soldier("by", 2, "by");

        // list.add(sl);

        //배열
        Soldier[] soldiers = {sl,se,sd};



        for (int i = 0; i < 3; i++) {
            list.add(soldiers[i]);
        } //리스트에 넣어짐

        for (int i = 0; i < list.size(); i++) {
            Soldier forsoldier = list.get(i);
            forsoldier.soldierinfo();
        }
    }





}
