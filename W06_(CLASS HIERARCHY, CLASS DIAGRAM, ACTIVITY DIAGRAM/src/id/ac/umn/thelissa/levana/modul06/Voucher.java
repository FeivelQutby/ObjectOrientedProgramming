package id.ac.umn.thelissa.levana.modul06;

public class Voucher extends Barang {
    private int pajak;
    public static int total;

    public Voucher(int id, String nama, int harga, int stock, int pajak) {
        super(id, nama, harga, stock);
        this.pajak = pajak;
    }

    public int getPajak() {
        return pajak;
    }

    @Override
    public int getStock() {
        return stock;
    }
}
