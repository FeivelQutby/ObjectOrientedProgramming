package id.ac.umn.thelissa.levana.modul09;

public class Magang extends Karyawan {
    public Magang() {
    }

    public Magang(String id, String nama) {
        super(id, nama);
    }

    public int getGaji() {
        return super.getGaji() + 1500000;
    }
}
