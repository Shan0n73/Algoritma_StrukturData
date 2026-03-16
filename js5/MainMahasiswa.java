public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa[] daftarMhs = {
        new Mahasiswa("Ahmad", "220101001", 2022, 78, 82),
        new Mahasiswa("Budi", "220101002", 2022, 85, 88),
        new Mahasiswa("Cindy", "220101003", 2021, 90, 87),
        new Mahasiswa("Dian", "220101004", 2021, 76, 79),
        new Mahasiswa("Eko", "220101005", 2023, 92, 95),
        new Mahasiswa("Fajar", "220101006", 2020, 88, 85),
        new Mahasiswa("Gina", "220101007", 2023, 80, 83),
        new Mahasiswa("Hadi", "220101008", 2020, 82, 84)
        };

        Mahasiswa mhs = new Mahasiswa("", "", 0, 0, 0);
        
        int max = mhs.cariUTSTertinggi(daftarMhs, 0, daftarMhs.length - 1);
        int min = mhs.cariUTSTerendah(daftarMhs, 0, daftarMhs.length - 1);
        
        double rata = mhs.rerataUAS(daftarMhs);
        System.out.println("Data Mahasiswa:");
        System.out.println("DC/Nilai UTS Tertinggi \t: " + max);
        System.out.println("DC/Nilai UTS Terendah \t: " + min);
        System.out.printf("BF/Rerata Nilai UAS\t: %.2f\n", rata);
    }
}