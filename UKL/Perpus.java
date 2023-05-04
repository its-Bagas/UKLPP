package UKL;

import java.util.Scanner;

public class Perpus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menu;
        // objeck
        Buku b = new Buku();
        Siswa s = new Siswa();
        // prog

        do {
            menu = getOption(in);
            execute(menu, b, s);
        } while (menu != 0);

    }

    public static void execute(int menu, Buku buku, Siswa siswa) {
        Laporan l = new Laporan();
        Pinjam pi = new Pinjam();
        Petugas p = new Petugas();
        switch (menu) {
            case 1:
                System.out.println("\t|| View Book ||");
                System.out.println();
                l.Laporan(buku);
                break;

            case 2:
                System.out.println("\t|| Borrow Book ||");
                System.out.println();
                pi.proses(siswa, buku, l, p);
                // l.Laporan(buku);
                // l.LaporanSiswa(siswa);
                break;

            case 3:
                System.out.println("\t|| Return Book ||");
                System.out.println();
                pi.pengembalian(siswa, buku, l);
                break;

            case 4:
                System.out.println("\t|| View Member ||");
                System.out.println();
                l.LaporanSiswa(siswa);
                break;

            case 5:
                System.out.println("\t|| Rules ||");
                System.out.println();
                l.aturan();
                System.out.println();
                l.pengem();
                break;
        }
    }

    public static int getOption(Scanner in) {
        int plh = 0;
        System.out.println();
        System.out.println("\t||Selamat datang di perpus||");
        System.out.println("=========================================");
        System.out.println(
                "1. View Book\n2. Borrow Book\n3. Return Book\n4. View Member\n5. Rules\n0. Exit");

        do {
            try {
                System.out.println("Enter your choice :");
                plh = in.nextInt();
                if (plh < 0 || plh > 5) {
                    System.out.println("Incorrect value type entered! ");
                }
            } catch (Exception e) {
                System.out.println("Incorrect data type entered! ");
                in.nextLine();
            }

        } while (plh < 0 || plh > 5);
        return plh;
    }
}
