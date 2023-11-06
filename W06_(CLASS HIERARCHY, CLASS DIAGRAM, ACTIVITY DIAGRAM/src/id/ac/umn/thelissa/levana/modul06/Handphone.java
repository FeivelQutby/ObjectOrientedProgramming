package id.ac.umn.thelissa.levana.modul06;

public class Handphone extends Barang {
    private String warna;
    public static int total;

    public Handphone(int id, String nama, int harga, int stock, String warna) {
        super(id, nama, harga, stock);
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    @Override
    public int getStock() {
        return stock;
    }
}
