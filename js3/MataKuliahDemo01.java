
import java.util.Scanner;

public class MataKuliahDemo01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah01[] arrayOfMatakuliah01 = new MataKuliah01[3];
        String code, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1) + " : ");
            System.out.print("KODE       : ");
            code = sc.nextLine();
            System.out.print("NAMA       : ");
            nama = sc.nextLine();
            System.out.print("SKS        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------------------");

            arrayOfMatakuliah01[i] = new MataKuliah01(code, nama, sks, jumlahJam);
        }
    }
}
