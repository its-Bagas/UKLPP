package UKL;

import java.util.jar.Attributes.Name;

public interface User {
    public void setNama(String nama);

    public void setAlamat(String alamat);

    public void setTelp(int telp);

    public String getNama(int id);

    public String getAlamat(int id);

    public int getTelp(int id);
}
