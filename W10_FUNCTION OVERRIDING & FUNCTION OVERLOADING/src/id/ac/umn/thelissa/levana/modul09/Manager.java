package id.ac.umn.thelissa.levana.modul09;

public class Manager extends Karyawan {
    public Manager() {
    }

    public Manager(String id, String nama) {
        super(id, nama);
    }

    public int getGaji() {
        return super.getGaji() + 10000000;
    }
}
