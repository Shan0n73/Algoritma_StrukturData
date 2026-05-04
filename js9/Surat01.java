package js9;

public class Surat01 {
    String idSurat;
    String namaMahasiswa;
    String Kelas;
    char jenisIzin;
    int durasi;

    Surat01() {
    }

    Surat01(String idS, String nMhs, String kls, char jnsIzin, int lamaIzin) {
        idSurat = idS;
        namaMahasiswa = nMhs;
        Kelas = kls;
        jenisIzin = jnsIzin;
        durasi = lamaIzin;
    }

    public String toString() {
        return "ID: " + idSurat + " | Nama: " + namaMahasiswa + " | Jenis: " + jenisIzin + " | Durasi: " + durasi + " hari";
    }
}
