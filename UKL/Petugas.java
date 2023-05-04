package UKL;

import java.util.ArrayList;

public class Petugas implements User {
     private ArrayList<String> namaKaryawan = new ArrayList<String>();
     private ArrayList<String> alamat = new ArrayList<String>();
     private ArrayList<Integer> telp = new ArrayList<Integer>();

     public Petugas() {
          this.namaKaryawan.add("yanto");
          this.alamat.add("lawang");
          this.telp.add(86753906);
     }

     public int getjmlhkar() {
          return this.namaKaryawan.size();
     }

     @Override
     public void setNama(String nama) {
          this.namaKaryawan.add(nama);
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
          return this.namaKaryawan.get(id);
     }

     @Override
     public String getAlamat(int id) {
          return this.alamat.get(id);
     }

     @Override
     public int getTelp(int id) {
          return this.telp.get(id);
     }

}
