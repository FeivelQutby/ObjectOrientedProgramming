package id.ac.umn.thelissa.levana.modul05;

public class Circle extends Shape {
    private double jariJari;

    public Circle(double jariJari, String warna) {
        super(warna);
        this.jariJari = jariJari;
    }

    public double getRadius() {
        return jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}
