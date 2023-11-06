package id.ac.umn.thelissa.levana.modul08.Model;

public class Order {
    private String idBarang;
    private Voucher voucher;
    private Handphone handphone;
    private int jumlah;
    private int totalHarga;

    public Order(String idBarang, Handphone handphone, int jumlah, int totalHarga) {
        this.idBarang = idBarang;
        this.handphone = handphone;
        this.jumlah = jumlah;
        this.totalHarga = totalHarga;
        this.voucher = null;
    }

    public Order(String idBarang, Voucher voucher, int jumlah, int totalHarga) {
        this.idBarang = idBarang;
        this.voucher = voucher;
        this.jumlah = jumlah;
        this.totalHarga = totalHarga;
        this.handphone = null;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public Voucher getVoucher() {
        return voucher;
    }

    public Handphone getHandphone() {
        return handphone;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getTotalHarga() {
        return totalHarga;
    }
}