package bus;

public class BusMain {
    public static void main(String[] args) {
        Passenger pass = new Passenger("치이카와");
        HiBus hb = new HiBus();
        BusPassenger Bpass = new BusPassenger("운전사1");

        hb.ride(pass);
        hb.count();
        hb.ride2(Bpass);

        hb.start();

    }
}
