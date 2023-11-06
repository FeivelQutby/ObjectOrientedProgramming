package id.ac.umn.thelissa.levana.modul08.Model;

public class Handphone extends Barang {
    private String warna;

    public Handphone(String id, String nama, int harga, int stock, String warna) {
        super(id, nama, harga, stock);
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }
}
