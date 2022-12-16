package my202212;

public class Pkmain {
    public static void main(String[] args) {
        Pikachu pk = new Pikachu();
        Pktrain pt = new Pktrain(pk);

        pt.PkGo();

        longs ln = new longs();
        Pktrain pkt = new Pktrain(ln);

        pkt.PkGo();

        Pijo pj = new Pijo();
        Pktrain pktr = new Pktrain(pj);

        pktr.PkGo();

        Gas gs = new Gas();
        Pktrain pktra = new Pktrain(gs);

        pktra.PkGo();


    }
}
