package js11;

import java.util.Scanner;

public class SLLMain01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SLL01 sll = new SLL01();
        Mahasiswa01 mhs = new Mahasiswa01("2197", "Arif", "TI-1C", 3.4);
        Mahasiswa01 mhs2 = new Mahasiswa01("2194", "Bimon", "TI-1B", 3.9);
        Mahasiswa01 mhs3 = new Mahasiswa01("2192", "Caca", "TI-1A", 3.6);

        sll.addFirst(mhs);
        sll.addLast(mhs2);
        sll.addLast(mhs3);
        sll.print();

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

    }
}
