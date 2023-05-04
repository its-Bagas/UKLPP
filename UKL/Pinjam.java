package UKL;

import java.util.ArrayList;
import java.util.Scanner;

import Toko.Member;

public class Pinjam {
    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();

    public void pinjam() {
        this.idBuku.add(0);
        this.idSiswa.add(0);
        this.banyak.add(2);
    }

    public void proses(Siswa siswa, Buku buku, Laporan laporan, Petugas petugas) {
        Scanner in = new Scanner(System.in);
        laporan.LaporanSiswa(siswa);

        System.out.print("Enter your id member : ");
        int member = in.nextInt();
        idSiswa.add(member);
        if (siswa.getStatus(member - 1) == false) {
            System.out.println("Maaf kamu tidak boleh meminjam, karena masih ada tanggungan");
        } else {
            System.out.println("selamat meminjam " + siswa.getNama(member - 1));
            System.out.println();
            System.out.println("------------List buku------------");
            laporan.Laporan(buku);
            System.out.print("Enter your id choise book : ");
            int choice = in.nextInt();
            idBuku.add(choice);
            System.out.println("Nama buku yang akan di pinjam " + buku.getNamaBuku(choice - 1));
            System.out.println("Apakah buku yang akan di pinjam sudah benar? (Y/N)");
            String jawab = in.next();
            if (jawab.equalsIgnoreCase("Y")) {
                if (buku.getStok(choice - 1) == 0) {
                    System.out.println("~Stok buku kosong~");
                } else {
                    System.out.println();
                    System.out.print("Masukan jumlah yang ingin di pinjam :");
                    int jumlah = in.nextInt();
                    banyak.add(jumlah);
                    if (jumlah > buku.getStok(choice - 1)) {
                        System.out.println("\tMaaf stok hanya " + buku.getStok(choice - 1));
                    } else if (jumlah == 0) {
                        System.out.println();
                        System.out.println("----------STRUK----------");
                        System.out.println("Anda tidak meminjam buku");

                    } else {
                        System.out.println();
                        System.out.println("----------STRUK----------");
                        buku.editStok(choice - 1, buku.getStok(choice - 1) - jumlah);
                        System.out
                                .println(
                                        "Stok buku " + buku.getNamaBuku(choice - 1) + " : " + buku.getStok(choice - 1));
                        System.out.println("Anda meminjam " + jumlah + " Buku " + buku.getNamaBuku(choice - 1));
                        System.out.println("Petugas perpus : " + petugas.getNama(member - 1));
                        siswa.editSta(member - 1, false);
                        System.out.println();
                    }

                }

            } else if (jawab.equalsIgnoreCase("N")) {
                System.out.println("Anda tidak meminjam buku");
            }

            // System.out.println("\t----Laporan Transaksi----");
            // System.out.println();
        }

    }

    public void pengembalian(Siswa siswa, Buku buku, Laporan laporan) {
        Scanner in = new Scanner(System.in);
        laporan.LaporanSiswa(siswa);
        System.out.println("Enter your id ");
        int member = in.nextInt();
        idSiswa.add(member);

        if (siswa.getStatus(member - 1) == true) {
            System.out.println("anda tidak ada tanggungan");
        } else {
            System.out.println("selamat datang " + siswa.getNama(member - 1));
            System.out.println();
            System.out.println("------------List buku------------");
            laporan.Laporan(buku);
            System.out.print("Enter return id book : ");
            int id = in.nextInt();
            idBuku.add(id);
            System.out.println("nama buku yang di kembalikan : " + buku.getNamaBuku(id - 1));
            System.out.println("Apakah buku yang di kembalikan sudah benar? (Y/N)");
            String jawab = in.next();
            if (jawab.equalsIgnoreCase("Y")) {
                System.out.print("masukan jumlah pengembalian buku :");
                int jumlah = in.nextInt();
                banyak.add(jumlah);
                buku.editStok(id - 1, buku.getStok(id - 1) + jumlah);
                siswa.editSta(member - 1, true);
                System.out.println("stok buku " + buku.getNamaBuku(id - 1) + " : " + buku.getStok(id - 1));
                System.out.println("terimakasih telah mengembalikan :)");
                System.out.println();
            } else if (jawab.equalsIgnoreCase("N")) {
                System.out.println("Anda tidak mengembalikan buku");
            }

        }
    }

    public ArrayList<Integer> getIdSiswa() {
        return idSiswa;
    }

    public void setIdSiswa(ArrayList<Integer> idSiswa) {
        this.idSiswa = idSiswa;
    }

    public ArrayList<Integer> getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(ArrayList<Integer> idBuku) {
        this.idBuku = idBuku;
    }

    public ArrayList<Integer> getBanyak() {
        return banyak;
    }

    public void setBanyak(ArrayList<Integer> banyak) {
        this.banyak = banyak;
    }

}

// public void beli(Siswa siswa, Buku buku, Laporan laporan) {
// Scanner in = new Scanner(System.in);
// laporan.LaporanSiswa(siswa);
// System.out.println("Enter your id ");
// int member = in.nextInt();
// idSiswa.add(member);
// System.out.println("selamat datang " + siswa.getNama(member - 1));
// System.out.println();
// System.out.println("------------List buku------------");
// laporan.Laporan(buku);
// System.out.print("Enter id book");
// int id = in.nextInt();
// idBuku.add(id);
// System.out.println("Nama buku yang dikembalikan : " + buku.getNamaBuku(id -
// 1));
// System.out.println("Apakah buku yang di kembalikan sudah benar? (Y/N)");
// String jawab = in.next();
// if (jawab.equalsIgnoreCase("Y")) {
// System.out.print("masukan jumlah pembelian buku :");
// int jumlah = in.nextInt();
// banyak.add(jumlah);
// buku.editStok(id - 1, buku.getStok(id - 1) - jumlah);
// System.out.println("stok buku " + buku.getNamaBuku(id - 1) + " : " +
// buku.getStok(id - 1));
// System.out.println("terimakasih telah membeli :)");
// System.out.println();
// } else if (jawab.equalsIgnoreCase("N")) {
// System.out.println("Anda tidak mengembalikan buku");
// }

// }
