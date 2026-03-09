
import java.util.Scanner;

public class DosenDemo01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen01[] arrayOfDosen01 = new Dosen01[3];
        String kode, nama;
        int usia;
        boolean jenisKelamin;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data Dosen ke-" + (i + 1));
            System.out.print("KODE\t\t\t\t: ");
            kode = sc.nextLine();
            System.out.print("NAMA\t\t\t\t: ");
            nama = sc.nextLine();
            System.out.print("JENIS KELAMIN(Pria/Wanita)\t: ");
            String inputJK = sc.nextLine();
            jenisKelamin = inputJK.equalsIgnoreCase("Pria");
            System.out.print("USIA\t\t\t\t: ");
            usia = Integer.parseInt(sc.nextLine());
            System.out.println("------------------------------");

            arrayOfDosen01[i] = new Dosen01(kode, nama, jenisKelamin, usia);
        }
        int i = 1;
        for (Dosen01 dosen : arrayOfDosen01) {
            System.out.println("Data Dosen ke-" + (i) + "\t: ");
            System.out.println("KODE\t\t\t\t: " + dosen.kode);
            System.out.println("NAMA\t\t\t\t: " + dosen.nama);

            String tampilJK = (dosen.jenisKelamin) ? "Pria" : "Wanita";
            System.out.println("JENIS KELAMIN\t\t\t: " + tampilJK);
            System.out.println("USIA\t\t\t\t: " + dosen.usia);
            i++;
            System.out.println("------------------------------");
        }
        DataDosen01 dataStats = new DataDosen01();
        dataStats.dataSemuaDosen(arrayOfDosen01);
        dataStats.jumlahDosenPerJenisKelamin(arrayOfDosen01);
        dataStats.rerataUsiaDosenPerJenisKelamin(arrayOfDosen01);
        dataStats.infoDosenPalingMuda(arrayOfDosen01);
        dataStats.infoDosenPalingTua(arrayOfDosen01);
    }
}
