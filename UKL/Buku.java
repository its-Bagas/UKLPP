package UKL;

import java.util.ArrayList;

public class Buku {
    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    public Buku() {
        this.namaBuku.add("puisi 3 baris");
        this.stok.add(89);
        this.harga.add(45000);

        this.namaBuku.add("Matematika X");
        this.stok.add(24);
        this.harga.add(35000);

        this.namaBuku.add("Buku Javascript");
        this.stok.add(12);
        this.harga.add(56000);

        this.namaBuku.add("komik doraemon");
        this.stok.add(3);
        this.harga.add(47000);

    }

    public int getbuku() {
        return this.namaBuku.size();
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku.add(namaBuku);
    }

    public void setStok(int stok) {
        this.stok.add(stok);
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public String getNamaBuku(int id) {
        return this.namaBuku.get(id);
    }

    public int getStok(int id) {
        return this.stok.get(id);
    }

    public int getHarga(int id) {
        return this.harga.get(id);
    }

    public void editStok(int idBarang, int stok) {
        this.stok.set(idBarang, stok);
    }

}
