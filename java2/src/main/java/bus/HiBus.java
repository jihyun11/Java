package bus;

import test3.Person;

import java.util.ArrayList;

public class HiBus {
    private ArrayList<Passenger> pslist = new ArrayList<>();
    private ArrayList<BusPassenger> pslist2 = new ArrayList<>(0);

    public void ride(Passenger passenger) {
        pslist.add(passenger);

    }
    public void ride2(BusPassenger busPassenger) {
        pslist2.add(busPassenger);
    }

    public void count() {
        int s = pslist.size();
        System.out.println(s);
    }

    public void start() {
        if (pslist2.size() == 0) {
            System.out.println("버스 운전사가 없으면 출발할 수 없습니다!");
        }
        if (pslist2.size() != 0 && pslist.size() != 0) {
            System.out.println("승객 " + pslist.size()+"명과 함께 출발합니다~");
        }

    }



}
