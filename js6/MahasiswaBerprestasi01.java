package js6;

public class MahasiswaBerprestasi01 {
    Mahasiswa01 [] listMhs;
    int idx;

    MahasiswaBerprestasi01(int jml){
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

    void tampil(){
        for (Mahasiswa01 m : listMhs) {
            if (m != null) {
            m.tampilInformasi();
            }
            System.out.println("-------------------");
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa01 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    

}

