package id.ac.umn.thelissa.levana.modul05;

public class PersegiPanjang extends Shape {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar, String warna) {
        super(warna);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}
