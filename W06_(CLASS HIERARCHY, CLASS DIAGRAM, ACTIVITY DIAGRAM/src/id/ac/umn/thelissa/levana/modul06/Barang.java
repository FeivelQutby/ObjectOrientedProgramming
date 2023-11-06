package id.ac.umn.thelissa.levana.modul06;

public class Barang {
    protected int id;
    protected String nama;
    protected int stock;
    protected int harga;

    public Barang(int id, String nama, int harga, int stock) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stock = stock;
    }

    public int getId() {
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
