public class MahasiswaMain01 {

    public static void main(String[] args) {
        Mahasiswa01 mhs1 = new Mahasiswa01();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";    
        mhs1.kelas = "SI 2F";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2L");
        mhs1.updateIpk(3.66);
        mhs1.nilaiKinerja();

    }
}

