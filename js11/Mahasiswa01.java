package js11;

public class Mahasiswa01 {

    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa01() {
    }

    public Mahasiswa01(String nm, String name, String kls) {
        nim = nm;
        nama = name;
        kelas = kls;
    }

    public void tampilInformasi() {
        System.out.println(nim + "\t\t" + nama + "\t\t" + kelas);
    }
}
