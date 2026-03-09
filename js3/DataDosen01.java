
public class DataDosen01 {

    public static void dataSemuaDosen(Dosen01[] arrayOfDosen) {
        for (Dosen01 dosen : arrayOfDosen) {
            System.out.println("KODE\t\t\t\t: " + dosen.kode);
            System.out.println("NAMA\t\t\t\t: " + dosen.nama);
            System.out.println("JENIS KELAMIN\t\t\t: " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("USIA\t\t\t\t: " + dosen.usia);
            System.out.println("------------------------------------");
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen01[] arrayOfDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (Dosen01 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }
        System.out.println("JUMLAH DOSEN PRIA\t\t: " + jumlahPria);
        System.out.println("JUMLAH DOSEN WANITA\t\t: " + jumlahWanita);
        System.out.println("------------------------------------");
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen01[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int jmlPria = 0;
        int jmlWanita = 0;

        for (Dosen01 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jmlPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jmlWanita++;
            }
        }

        double rerataUsiaPria = jmlPria > 0 ? (double) totalUsiaPria / jmlPria : 0;
        double rerataUsiaWanita = jmlWanita > 0 ? (double) totalUsiaWanita / jmlWanita : 0;

        System.out.println("RERATA USIA DOSEN PRIA\t\t: " + rerataUsiaPria);
        System.out.println("RERATA USIA DOSEN WANITA\t: " + rerataUsiaWanita);
        System.out.println("------------------------------------");
    }

    public static void infoDosenPalingTua(Dosen01[] arrayOfDosen) {
        Dosen01 dosenTua = arrayOfDosen[0];

        for (Dosen01 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTua.usia) {
                dosenTua = dosen;
            }
        }

        System.out.println("DOSEN PALING TUA\t\t:");
        System.out.println("KODE\t\t\t\t: " + dosenTua.kode);
        System.out.println("NAMA\t\t\t\t: " + dosenTua.nama);
        System.out.println("JENIS KELAMIN\t\t\t: " + (dosenTua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("USIA\t\t\t\t: " + dosenTua.usia);
        System.out.println("------------------------------------");
    }

    public static void infoDosenPalingMuda(Dosen01[] arrayOfDosen) {
        Dosen01 dosenMuda = arrayOfDosen[0];

        for (Dosen01 dosen : arrayOfDosen) {
            if (dosen.usia < dosenMuda.usia) {
                dosenMuda = dosen;
            }
        }

        System.out.println("DOSEN PALING MUDA\t\t:");
        System.out.println("KODE\t\t\t\t: " + dosenMuda.kode);
        System.out.println("NAMA\t\t\t\t: " + dosenMuda.nama);
        System.out.println("JENIS KELAMIN\t\t\t: " + (dosenMuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("USIA\t\t\t\t: " + dosenMuda.usia);
        System.out.println("------------------------------------");
    }
}
