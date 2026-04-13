package js6;

public class Dosen01{
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen01(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("Kode Dosen \t\t:" + kode);
        System.out.println("Nama Dosen \t\t:" + nama);
        System.out.println("Jenis Kelamin \t\t:" + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia \t\t\t:" + usia + " tahun");
    }
}