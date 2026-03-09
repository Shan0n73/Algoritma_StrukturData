public class MataKuliah01 {
    public String code;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah01(String code, String nama, int sks, int jumlahJam){
        this.code = code;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public void tambahData(String code, String nama, int sks, int jumlahJam){
        this.code = code;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    void cetakinfo(int i){
        System.out.println("Data Matakuliah ke-" + (i + 1) + " : ");
            System.out.println("KODE             : "+code);
            System.out.println("NAMA             : "+nama);
            System.out.println("SKS              : "+sks);
            System.out.println("JUMLAH JAM       : "+jumlahJam);
            System.out.println("------------------------------------------");
    }
}
