package id.ac.umn.thelissa.levana.modul06;

public class Order {
    private int idBarang;
    private Voucher voucher;
    private Handphone handphone;
    private int jumlah;
    private int totalHarga;

    public Order(int idBarang, Handphone handphone, int jumlah, int totalHarga) {
        this.idBarang = idBarang;
        this.handphone = handphone;
        this.jumlah = jumlah;
        this.totalHarga = totalHarga;
        this.voucher = null;
    }

    public Order(int idBarang, Voucher voucher, int jumlah, int totalHarga) {
        this.idBarang = idBarang;
        this.voucher = voucher;
        this.jumlah = jumlah;
        this.totalHarga = totalHarga;
        this.handphone = null;
    }

    public int getIdBarang() {
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
