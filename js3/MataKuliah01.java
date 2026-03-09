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
<<<<<<< HEAD
            System.out.println("KODE\t\t:"+code);
            System.out.println("NAMA\t\t:"+nama);
            System.out.println("SKS\t\t:"+sks);
            System.out.println("JUMLAH JAM\t: "+jumlahJam);
=======
            System.out.println("KODE             : "+code);
            System.out.println("NAMA             : "+nama);
            System.out.println("SKS              : "+sks);
            System.out.println("JUMLAH JAM       : "+jumlahJam);
>>>>>>> 829cb05a2c8fe95fcae6808c54b914f8fb707e05
            System.out.println("------------------------------------------");
    }
}
