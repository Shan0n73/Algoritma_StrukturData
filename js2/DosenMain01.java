
public class DosenMain01 {

    public static void main(String[] args) {

        Dosen01 d1 = new Dosen01();
        d1.idDosen = "D001";
        d1.nama = "Yahya";
        d1.tahunBergabung = 2015;
        d1.ubahKeahlian("Struktur Data");
        d1.setStatusAktif(true);

        Dosen01 d2 = new Dosen01("D003", "Ilham", true, 2016, "Basis Data");

        d1.tampilInformasi();
        System.out.println("Masa Kerja: " + d1.hitungMasaKerja(2026) + " tahun\n");

        d2.tampilInformasi();
        System.out.println("Masa Kerja: " + d2.hitungMasaKerja(2026) + " tahun\n");

        d2.ubahKeahlian("Sistem Operasi");
        d2.setStatusAktif(false);
        d2.tampilInformasi();
    }
}
