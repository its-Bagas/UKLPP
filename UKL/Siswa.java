package UKL;

import java.util.ArrayList;

public class Siswa implements User {
    private ArrayList<String> nama = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<Integer> telp = new ArrayList<Integer>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    public Siswa() {
        this.nama.add("Budi");
        this.alamat.add("kademangan");
        this.telp.add(8544678);
        this.status.add(true);

        this.nama.add("Resya");
        this.alamat.add("Ksatrian");
        this.telp.add(876543);
        this.status.add(true);

        this.nama.add("Badrul");
        this.alamat.add("pulosari");
        this.telp.add(834521);
        this.status.add(true);

        this.nama.add("Yusuf");
        this.alamat.add("Sawojajar");
        this.telp.add(837890);
        this.status.add(true);

        this.nama.add("Adit");
        this.alamat.add("Prigi");
        this.telp.add(834467);
        this.status.add(true);
    }

    public int getJmlSis() {
        return this.nama.size();
    }

    @Override
    public void setNama(String nama) {
        this.nama.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelp(int telp) {
        this.telp.add(telp);
    }

    @Override
    public String getNama(int id) {

        return this.nama.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public int getTelp(int id) {
        return this.telp.get(id);
    }

    public void setStatus(boolean status) {
        this.status.add(status);
    }

    public boolean getStatus(int i) {
        return this.status.get(i);
    }

    public boolean editSta(int id, boolean status) {
        return this.status.set(id, status);
    }

}
