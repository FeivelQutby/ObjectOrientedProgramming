package id.ac.umn.thelissa.levana.modul08.Model;

public class Voucher extends Barang {
    private int pajak;

    public Voucher(String id, String nama, int harga, int stock, int pajak) {
        super(id, nama, harga, stock);
        this.pajak = pajak;
    }

    public int getPajak() {
        return pajak;
    }
}
