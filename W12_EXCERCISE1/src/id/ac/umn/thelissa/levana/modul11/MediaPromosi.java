package id.ac.umn.thelissa.levana.modul11;

public class MediaPromosi {
    private String nama;
    private int harga;

    public MediaPromosi() {
        super();
    }

    public MediaPromosi(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }
}
