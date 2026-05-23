package js13_cm2;

public class NodeAntrean01 {

    int noAntrean;
    Pembeli01 pembeli;
    Pesanan01 pesanan;

    NodeAntrean01 next;
    NodeAntrean01 prev;

    public NodeAntrean01(int noAntrean, Pembeli01 pembeli) {
        this.noAntrean = noAntrean;
        this.pembeli = pembeli;

        this.pesanan = null;

        this.next = null;
        this.prev = null;
    }
}
