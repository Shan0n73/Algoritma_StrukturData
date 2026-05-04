package js7;
import java.util.Scanner;
public class ManajemenPeminjamanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            Mahasiswa[] mhs = {
                new Mahasiswa("22001", "Andi", "TI"),
                new Mahasiswa("22002", "Budi", "TI"),
                new Mahasiswa("22003", "Citra", "SIB")
            };


            Buku[] buku = {
                new Buku("B001", "Algoritma", 2020),
                new Buku("B002", "Basis Data", 2019),
                new Buku("B003", "Pemrograman", 2021),
                new Buku("B004", "Fisika", 2024)
            };


            Peminjaman[] pinjam = {
                new Peminjaman(mhs[0], buku[0], 7),
                new Peminjaman(mhs[1], buku[1], 3),
                new Peminjaman(mhs[2], buku[2], 10),
                new Peminjaman(mhs[2], buku[3], 6),
                new Peminjaman(mhs[0], buku[1], 4)
            };

            int pilih;
            do {
                System.out.println("\n=== MENU ===");
                System.out.println("1. Tampilkan Mahasiswa & Buku");
                System.out.println("2. Tampilkan Peminjaman");
                System.out.println("3. Hitung Denda");
                System.out.println("4. Urutkan Denda (Insertion Sort)");
                System.out.println("5. Cari berdasarkan NIM (Binary Search)");
                System.out.println("0. Keluar");
                System.out.print("Pilih: ");
                pilih = sc.nextInt();

                switch (pilih) {
                    case 1:
                        System.out.println("\nDATA MAHASISWA:");
                        for (Mahasiswa m : mhs) {
                            System.out.println(m.nim + " - " + m.nama + " - " + m.prodi);
                        }

                        System.out.println("\nDATA BUKU:");
                        for (Buku b : buku) {
                            System.out.println(b.kode + " - " + b.judul + " - " + b.tahun);
                        }
                        break;

                    case 2:
                        System.out.println("\nDATA PEMINJAMAN:");
                        for (Peminjaman p : pinjam) {
                            System.out.println(p.mhs.nim + " - " + p.mhs.nama
                                    + " | " + p.buku.judul
                                    + " | Lama: " + p.lamaPinjam + " hari");
                        }
                        break;

                    case 3:
                        System.out.println("\nDATA DENDA:");
                        for (Peminjaman p : pinjam) {
                            System.out.println(p.mhs.nama + " | "
                                    + p.buku.judul + " | Denda: " + p.denda);
                        }
                        break;

                    case 4:
                        for (int i = 1; i < pinjam.length; i++) {
                            Peminjaman temp = pinjam[i];
                            int j = i - 1;

                            while (j >= 0 && pinjam[j].denda < temp.denda) {
                                pinjam[j + 1] = pinjam[j];
                                j--;
                            }
                            pinjam[j + 1] = temp;
                        }

                        System.out.println("\nSETELAH SORTING (DENDA TERBESAR):");
                        for (Peminjaman p : pinjam) {
                            System.out.println(p.mhs.nama + " | "
                                    + p.buku.judul + " | Denda: " + p.denda);
                        }
                        break;

                    case 5:
                        for (int i = 1; i < pinjam.length; i++) {
                            Peminjaman temp = pinjam[i];
                            int j = i - 1;

                            while (j >= 0
                                    && pinjam[j].mhs.nim.compareTo(temp.mhs.nim) > 0) {
                                pinjam[j + 1] = pinjam[j];
                                j--;
                            }
                            pinjam[j + 1] = temp;
                        }

                        System.out.print("Masukkan NIM: ");
                        String cari = sc.next();

                        int kiri = 0,
                         kanan = pinjam.length - 1;
                        boolean ketemu = false;

                        while (kiri <= kanan) {
                            int mid = (kiri + kanan) / 2;

                            if (pinjam[mid].mhs.nim.equals(cari)) {
                                System.out.println("Ditemukan:");
                                System.out.println(pinjam[mid].mhs.nama
                                        + " | " + pinjam[mid].buku.judul
                                        + " | Denda: " + pinjam[mid].denda); 
                                ketemu = true;
                                break;
                            } else if (pinjam[mid].mhs.nim.compareTo(cari) < 0) {
                                kiri = mid + 1;
                            } else {
                                kanan = mid - 1;
                            }
                        }

                        if (!ketemu) {
                            System.out.println("Data tidak ditemukan");
                        }
                        break;
                }

            } while (pilih != 0);
        }
    }
