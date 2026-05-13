package js10;

public class DataMahasiswa01 {
    String nama, nim;

    public DataMahasiswa01(String nim, String nama) {
        this.nama = nama;
        this.nim = nim;
    }

    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama;
    }
}
