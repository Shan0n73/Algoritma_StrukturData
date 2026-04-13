package js6;

import java.util.Scanner;

public class MahasiswaDemo01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc.nextInt();

        MahasiswaBerprestasi01 data = new MahasiswaBerprestasi01(jml);
        for (int i = 0; i < jml; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.next();
            System.out.print("Nama: ");
            String nama = sc.next();
            System.out.print("Kelas: ");
            String kelas = sc.next();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            System.out.println("-------------------");
            Mahasiswa01 mhs = new Mahasiswa01(nim, nama, kelas, ipk);
            data.tambah(mhs);
        }

        System.out.println("Data Mahasiswa sebelum sorting:");
        data.tampil();

        System.out.println("Data yang sudah diurutkan menggunakan INSERTION SORT (DESC)");
        data.insertionSort();
        data.tampil();
    }

}
