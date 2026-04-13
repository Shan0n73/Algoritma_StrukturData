package js6;

public class MahasiswaBerprestasi01 {

    Mahasiswa01[] listMhs;
    int idx;

    MahasiswaBerprestasi01(int jml) {
        listMhs = new Mahasiswa01[jml];
    }

    void tambah(Mahasiswa01 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa01 m : listMhs) {
            if (m != null) {
                m.tampilInformasi();
            }
            System.out.println("-------------------");
        }
    }

    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa01 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j-1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
