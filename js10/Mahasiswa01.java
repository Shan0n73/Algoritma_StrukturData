package js10;

public class Mahasiswa01 {
    String nama, nim, prodi, kelas;

    public Mahasiswa01(String nim, String nama, String prodi, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
