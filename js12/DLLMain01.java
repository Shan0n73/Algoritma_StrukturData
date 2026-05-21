package js12;

import java.util.Scanner;

public class DLLMain01 {
    public static Mahasiswa01 inputMahasiswa(Scanner sc) {
        System.out.print("Masukkan NIM\t: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama\t: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas\t: ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK\t: ");
        double ipk = sc.nextDouble();
        sc.nextLine();
        return new Mahasiswa01(nim, nama, kelas, ipk);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLL01 list = new DLL01();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa01 mhsAwal = inputMahasiswa(sc);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa01 mhsAkhir = inputMahasiswa(sc);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String keyNim = sc.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa01 dataBaru = inputMahasiswa(sc);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 0:
                    System.out.println("Program Selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
