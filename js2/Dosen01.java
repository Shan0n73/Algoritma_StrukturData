public class Dosen01 {

    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen01() {
        idDosen = "";
        nama = "";
        statusAktif = false;
        tahunBergabung = 0;
        bidangKeahlian = "";
    }

    public Dosen01(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    public void tampilInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Gabung: " + tahunBergabung);
        System.out.println("Bidang: " + bidangKeahlian);
        System.out.println();
    }

    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
    }

    public int hitungMasaKerja(int thnSekarang) {
        return thnSekarang - tahunBergabung;
    }

    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
    }
}

