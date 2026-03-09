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
            System.out.println("KODE\t\t:"+code);
            System.out.println("NAMA\t\t:"+nama);
            System.out.println("SKS\t\t:"+sks);
            System.out.println("JUMLAH JAM\t: "+jumlahJam);
            System.out.println("------------------------------------------");
    }
}
