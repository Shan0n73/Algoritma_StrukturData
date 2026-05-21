package js11;

import java.util.Scanner;

public class SLLMain01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SLL01 sll = new SLL01();
        char pilih;

        do {
            System.out.println("--- Input Data Mahasiswa ---");
            System.out.print("Nama    : ");
            String nama = sc.nextLine();
            System.out.print("NIM     : ");
            String nim = sc.nextLine();
            System.out.print("Kelas   : ");
            String kelas = sc.nextLine();
            System.out.print("IPK     : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa01 mhs = new Mahasiswa01(nama, nim, kelas, ipk);
            sll.addLast(mhs);

            System.out.print("Tambah data lagi? (y/n): ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("");

        } while (pilih == 'y' || pilih == 'Y');

        sll.print();

    }
}
