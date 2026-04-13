package js6;

public class DataDosen01 {
     Dosen01 [] dataDosen = new Dosen01[10];
        int idx = 0;

        void tambah(Dosen01 dsn) {
            if (idx < dataDosen.length) {
                dataDosen[idx] = dsn;
                idx++;
            } else {
                System.out.println("Data sudah penuh!");
            }
        }

        void tampil() {
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
                System.out.println("-------------------");
            }
        }

        void sortingASC() {
            for (int i = 0; i < idx - 1; i++) {
                for (int j = 1; j < idx - i; j++) {
                    if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                        Dosen01 temp = dataDosen[j];
                        dataDosen[j] = dataDosen[j - 1];
                        dataDosen[j - 1] = temp;
                    }
                }
            }
        }

        void sortingDSC() {
            for (int i = 1; i < idx; i++) {
                Dosen01 temp = dataDosen[i];
                int j = i;
                while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                    dataDosen[j] = dataDosen[j - 1];
                    j--;
                }
                dataDosen[j] = temp;
            }
        }
}
