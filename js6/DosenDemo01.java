package js6;

public class DosenDemo01 {

    public static void main(String[] args) {
        DataDosen01 list = new DataDosen01();
        Dosen01 dsn1 = new Dosen01("D11", "Agung", true, 34);
        Dosen01 dsn2 = new Dosen01("D12", "Budi", true, 29);
        Dosen01 dsn3 = new Dosen01("D13", "Citra", false, 30);
        Dosen01 dsn4 = new Dosen01("D14", "Diana", false, 26);
        Dosen01 dsn5 = new Dosen01("D15", "Eka", false, 25);
        Dosen01 dsn6 = new Dosen01("D16", "Feri", true, 32);
        Dosen01 dsn7 = new Dosen01("D17", "Gita", false, 31);
        Dosen01 dsn8 = new Dosen01("D18", "Husna", false, 27);
        Dosen01 dsn9 = new Dosen01("D19", "Ilham", true, 38);
        Dosen01 dsn10 = new Dosen01("D20", "Jerry", true, 28);

        list.tambah(dsn1);
        list.tambah(dsn2);
        list.tambah(dsn3);
        list.tambah(dsn4);
        list.tambah(dsn5);
        list.tambah(dsn6);
        list.tambah(dsn7);
        list.tambah(dsn8);
        list.tambah(dsn9);
        list.tambah(dsn10);

        System.out.println("Data Dosen sebelum sorting:");
        list.tampil();

        System.out.println("Data Dosen setelah Bubble Sorting ASC:");
        list.sortingASC();
        list.tampil();

        System.out.println("Data Dosen setelah Insertion Sorting DSC:");
        list.sortingDSC();
        list.tampil();

    }
}
