public class Mahasiswa01 {

    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        if (0.0 <= ipk && ipk <= 4.0) {
        ipk = ipkBaru;
        } else {
            System.out.println("IPK harus berada dalam rentang 0 hingga 4");
        }
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return " Kinerja Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk >= 2.5) {
            return "Kinerja Cukup";
        } else {
            return "KinerjaKurang";
        }
    }

}
