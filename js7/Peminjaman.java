package js7;

class Peminjaman {

    Mahasiswa mhs;
    Buku buku;
    int lamaPinjam;
    int denda;

    Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        this.denda = hitungDenda();
    }


    int hitungDenda() {
        int batas = 5;
        int dendaPerHari = 2000;

        if (lamaPinjam > batas) {
            return (lamaPinjam - batas) * dendaPerHari;
        } else {
            return 0;
        }
    }
}
