package id.ac.umn.thelissa.levana.modul04;

public class Pesanan {
    private int idBarang;
    private String namaBarang;
    private int jumlah;
    private double totalBiaya;

    public Pesanan(int idBarang, String namaBarang, int jumlah, double totalBiaya) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.totalBiaya = totalBiaya;
    }

    public int getIdBarang() {
        return idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }
}
