
import java.util.Scanner;

public class MainPangkat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen : ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + i + " : ");
            int basis = sc.nextInt();
            System.out.print("Masukkan nilai Pangkat elemen ke-" + i + " : ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat(basis, pangkat);
        }
        System.out.println("HASIL PANGKAT BRUTE FORCE : ");
        for (Pangkat p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " : " + p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE CONQUER : ");
        for (Pangkat p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " : " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
