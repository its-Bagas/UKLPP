package UKL;

public class Laporan {

    public void Laporan(Buku buku) {
        int b = buku.getbuku();

        System.out.println("Id \tNama \t\tStok \tHarga");

        for (int i = 0; i < b; i++) {
            System.out.println(i + 1 + "\t" + buku.getNamaBuku(i) + "\t" + buku.getStok(i) + "\t" + buku.getHarga(i));
        }
        System.out.println();
    }

    public void LaporanSiswa(Siswa siswa) {
        int x = siswa.getJmlSis();
        System.out.println("\tList Siswa");
        System.out.println("----------------------------------");
        System.out.println("Id \tNama \tAlamat \t\tTelp \tStatus");

        for (int i = 0; i < x; i++) {
            System.out.println(i + 1 + "\t" + siswa.getNama(i) + "\t" + siswa.getAlamat(i) + "\t" + siswa.getTelp(i)
                    + "\t" + (siswa.getStatus(i) ? "boleh meminjam" : "tidak boleh meminjam"));
        }
        System.out.println();
    }

    public void LaporanPetugas(Petugas petugas) {
        int y = petugas.getjmlhkar();

        System.out.println("Id \tNama \tAlamat \tTelp \tStatus");
        for (int i = 0; i < y; i++) {
            System.out.println(
                    i + 1 + "\t" + petugas.getNama(i) + "\t" + petugas.getAlamat(i) + "\t" + petugas.getTelp(i));
        }
    }

    public void aturan() {
        System.out.println("\tTata cara meminjam");
        System.out.println("----------------------------------");
        System.out.println("1. Pilih section ~Borrow book~");
        System.out.println("2. Masukan id siswa");
        System.out.println("3. Masukan id buku yang ingin di pinjam");
        System.out.println("4. Masukan jumlah buku yang akan di pinjam");
        System.out.println("Peminjaman selesai");
        System.out.println(
                "*NB : Anda tidak bisa meminjam lagi sebelum mengembalikan buku pinjaman pada section ~Return book~");
    }

    public void pengem() {
        System.out.println("\tTata cara pengembalian");
        System.out.println("----------------------------------");
        System.out.println("1. Pilih section ~Return book~");
        System.out.println("2. Masukan id siswa");
        System.out.println("3. Masukan id buku yang ingin di kembalikan");
        System.out.println("4. Masukan jumlah buku yang akan di kembalikan");
        System.out.println("Pengembalian selesai");
        System.out.println("*NB : Anda bisa meminjam buku lagi pada section ~Borrow book~");
        System.out.println();
    }

}
