
import java.util.Scanner;

public class MainFaktorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Faktorial : ");
        int nilai = sc.nextInt();

        Faktorial fk = new Faktorial();
        System.out.println("Nilai Faktorial " + nilai + " menggunakan BF adalah: " + fk.faktorialBF(nilai));
        System.out.println("Nilai Faktorial " + nilai + " menggunakan DC adalah: " + fk.faktorialDC(nilai));
    }
}

