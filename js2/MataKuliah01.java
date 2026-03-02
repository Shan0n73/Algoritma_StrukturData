public class MataKuliah01 {
      
    String kodeMK;
    String nama;
    int sks;
    int jumlahjam;

    public MataKuliah01() {
    }

    public MataKuliah01(String kMK, String n, int sks, int jumlahjam) {
        kodeMK = kMK;
        nama = n;
        this.sks = sks;
        this.jumlahjam = jumlahjam;
    }

    void tampilkanInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahjam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS untuk " + nama + " berhasil diubah menjadi: " + sks);
    }

    void tambahJam(int jam) {
        jumlahjam += jam;
        System.out.println("Jumlah jam berhasil ditambah, total jam saat ini: " + jumlahjam);
    }

    void kurangiJam(int jam) {
        if (jumlahjam >= jam) {
            jumlahjam -= jam;
            System.out.println("Pengurangan jam berhasil, jumlah jam saat ini: " + jumlahjam);
        } else {
        System.out.println("Pengurangan jam gagal, jumlah jam yang dimiliki tidak memenuhi kriteria minimum.");
        }
    }
}
