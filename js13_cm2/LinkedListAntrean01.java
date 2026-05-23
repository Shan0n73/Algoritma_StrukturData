package js13_cm2;

import java.util.Scanner;

public class LinkedListAntrean01 {

    NodeAntrean01 head;
    NodeAntrean01 tail;
    int counterAntrean = 1;
    int totalPendapatan = 0;

    public void tambahAntrean(String nama, String noHp) {
        Pembeli01 pembeliBaru = new Pembeli01(nama, noHp);
        NodeAntrean01 nodeBaru = new NodeAntrean01(counterAntrean, pembeliBaru);

        if (head == null) {
            head = nodeBaru;
            tail = nodeBaru;
        } else {
            tail.next = nodeBaru;
            nodeBaru.prev = tail;
            tail = nodeBaru;
        }

        System.out.println("Telah berhasil menambahkan antrean! Nomor antrean anda adalah: " + counterAntrean);
        counterAntrean++;
    }

    public void cetakAntrean() {
        if (head == null) {
            System.out.println("Tidak ada antrean antrean tercatat.");
            return;
        }

        System.out.println("\n=== DAFTAR ANTREAN SAAT INI ===");
        System.out.printf("%-10s %-20s %-15s\n", "No Antrean", "Nama Pembeli", "No HP");
        System.out.println("----------------------------------------------");

        NodeAntrean01 current = head;

        while (current != null) {
            System.out.printf("%-10d %-20s %-15s\n",
                    current.noAntrean,
                    current.pembeli.namaPembeli,
                    current.pembeli.NoHp);

            current = current.next;
        }
    }

    public void panggilAntrean(Scanner input) {
        if (head == null) {
            System.out.println("Tidak ada antrean untuk dipanggil.");
            return;
        }

        NodeAntrean01 dipanggil = head;

        System.out.println("\nMemanggil antrean nomor " + dipanggil.noAntrean + " atas nama " + dipanggil.pembeli.namaPembeli);

        System.out.print("Masukkan Kode Pesanan (angka): ");
        int kode = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan Nama Makanan: ");
        String namaMakanan = input.nextLine();

        System.out.print("Masukkan Harga: ");
        int harga = input.nextInt();
        input.nextLine();

        dipanggil.pesanan = new Pesanan01(kode, namaMakanan, harga);

        totalPendapatan += harga;

        System.out.println("Pesanan berhasil dicatat!");

        head = head.next;

        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }

        System.out.println("Antrean nomor " + dipanggil.noAntrean + " telah keluar dari antrean utama.");
    }

    public void cetakPendapatan() {
        System.out.println("\n=== DATA PENDAPATAN RESTORAN ===");
        System.out.println("Total pendapatan saat ini adalah Rp." + totalPendapatan);
    }
}
