package id.ac.umn.thelissa.levana.modul05;

public class SegitigaSikuSiku extends Shape {
    private double alas;
    private double tinggi;

    public SegitigaSikuSiku(double alas, double tinggi, String warna) {
        super(warna);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        double sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi));
        return alas + tinggi + sisiMiring;
    }
}
