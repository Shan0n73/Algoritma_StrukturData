package js9;

public class Mahasiswa01 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa01(){
    }

    Mahasiswa01(String name, String nm, String kls){
        nama = name;
        nim = nm;
        kelas = kls;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
