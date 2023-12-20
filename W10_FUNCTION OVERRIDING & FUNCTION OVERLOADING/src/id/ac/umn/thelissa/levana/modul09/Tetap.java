package id.ac.umn.thelissa.levana.modul09;

public class Tetap extends Karyawan {
    public Tetap() {
    }

    public Tetap(String id, String nama) {
        super(id, nama);
    }

    public int getGaji() {
        return super.getGaji() + 3000000;
    }
}
