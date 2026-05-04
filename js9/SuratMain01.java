package js9;

import java.util.Scanner;

public class SuratMain01 {

    public static void main(String[] args) {
        StackSurat01 stackSurat = new StackSurat01(50);
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMENU MANAJEMEN SURAT PERIZINAN MAHASISWA");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (Sakit/Izin): ");
                    char jenisIzin = sc.nextLine().charAt(0);
                    System.out.print("Durasi (Hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat01 suratBaru = new Surat01(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stackSurat.push(suratBaru);
                    break;
                case 2:
                    stackSurat.pop();
                    break;
                case 3:
                    stackSurat.peek();
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String nama = sc.nextLine();
                    stackSurat.Search(nama);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        } while (pilih != 0);
        System.out.println("Terima kasih.");

    }
}
