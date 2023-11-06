package id.ac.umn.thelissa.levana.modul08.Model;

public class Barang {
    protected String id;
    protected String nama;
    protected int stock;
    protected int harga;

    public Barang(String id, String nama, int harga, int stock) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getStock() {
        return stock;
    }

    public int getHarga() {
        return harga;
    }

    public void kurangiStock(int jumlah) {
        if (jumlah <= stock) {
            stock -= jumlah;
        }
    }
}
