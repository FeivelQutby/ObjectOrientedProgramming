package id.ac.umn.thelissa.levana.modul04;

public class Barang {
    private int id;
    private String nama;
    private int stock;
    private double harga;

    public Barang(int id, String nama, int stock, double harga) {
        this.id = id;
        this.nama = nama;
        this.stock = stock;
        this.harga = harga;
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

    public double getHarga() {
        return harga;
    }

    public void kurangiStock(int jumlah) {
        if (jumlah <= stock) {
            stock -= jumlah;
        }
    }
}
