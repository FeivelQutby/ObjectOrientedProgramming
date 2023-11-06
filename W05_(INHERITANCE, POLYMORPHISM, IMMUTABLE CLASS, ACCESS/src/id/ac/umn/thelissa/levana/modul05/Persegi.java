package id.ac.umn.thelissa.levana.modul05;

public class Persegi extends Shape {
    private double sisi;

    public Persegi(double sisi, String warna) {
        super(warna);
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}
