
import java.util.Scanner;

public class MataKuliahDemo01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Matakuliah : ");
        int matakuliah = sc.nextInt();
        MataKuliah01[] arrayOfMatakuliah01 = new MataKuliah01[matakuliah];
        String code, nama, dummy;
        int sks, jumlahJam;
        sc.nextLine();
        System.out.println();
        for (int i = 0; i < matakuliah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1) + " : ");
            System.out.print("KODE\t\t: ");
            code = sc.nextLine();
            System.out.print("NAMA\t\t: ");
            nama = sc.nextLine();
            System.out.print("SKS\t\t: ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam\t: ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------------------");

            arrayOfMatakuliah01[i] = new MataKuliah01(code, nama, sks, jumlahJam);
            arrayOfMatakuliah01[i].tambahData(code, nama, sks, jumlahJam);
        }
        for (int i = 0; i < matakuliah; i++) {
            arrayOfMatakuliah01[i].cetakinfo(i);
        }
    }
}
