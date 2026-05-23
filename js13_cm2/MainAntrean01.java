package js13_cm2;

import java.util.Scanner;

public class MainAntrean01 {

    public static void main(String[] args) {
        LinkedListAntrean01 sistemAntrean = new LinkedListAntrean01();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n========= RESTO ROYAL DELISH =========");
            System.out.println("1. Tambah Antrean");
            System.out.println("2. Cetak Antrean");
            System.out.println("3. Panggil & Hapus Antrean (Pemesanan)");
            System.out.println("4. Lihat Total Pendapatan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Pembeli: ");
                    String nama = input.nextLine();

                    System.out.print("Masukkan No HP Pembeli: ");
                    String noHp = input.nextLine();

                    sistemAntrean.tambahAntrean(nama, noHp);
                    break;

                case 2:
                    sistemAntrean.cetakAntrean();
                    break;

                case 3:
                    sistemAntrean.panggilAntrean(input);
                    break;

                case 4:
                    sistemAntrean.cetakPendapatan();
                    break;

                case 5:
                    System.out.println("Terima kasih! Mengeluarkan sistem...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }

        } while (pilihan != 5);
    }
}
