package id.ac.umn.thelissa.levana.modul11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
    private MediaPromosi mediaPromosi;
    private String bidang;
    private String tanggal;
    private int jangkaWaktu;

    public Order() {
        super();
    }

    public Order(MediaPromosi mediaPromosi, String bidang, String tanggal, int jangkaWaktu) {
        this.mediaPromosi = mediaPromosi;
        this.bidang = bidang;
        this.tanggal = tanggal;
        this.jangkaWaktu = jangkaWaktu;
    }

    public MediaPromosi getMediaPromosi() {
        return mediaPromosi;
    }

    public String getBidang() {
        return bidang;
    }

    public String getTanggal() {
        return tanggal;
    }

    public int getJangkaWaktu() {
        return jangkaWaktu;
    }

    public boolean isCancelable() {
        String todayDate = new SimpleDateFormat("ddMMyyyy").format(new Date());

        return !todayDate.equals(tanggal);
    }

    public String getNama() {
        if (mediaPromosi instanceof Aktor) {
            return ((Aktor) mediaPromosi).getNama();
        } else if (mediaPromosi instanceof Celebgram) {
            return ((Celebgram) mediaPromosi).getNama();
        } else if (mediaPromosi instanceof Baliho) {
            return ((Baliho) mediaPromosi).getNama();
        } else if (mediaPromosi instanceof Majalah) {
            return ((Majalah) mediaPromosi).getNama();
        } else {
            return "Unknown";
        }
    }

    public int getTotalBayar() {
        if (mediaPromosi instanceof Aktor) {
            return ((Aktor) mediaPromosi).getHarga() * jangkaWaktu;
        } else if (mediaPromosi instanceof Celebgram) {
            Celebgram celebgram = (Celebgram) mediaPromosi;
            int harga = celebgram.getHarga();
            if (celebgram.getBidang().equals(bidang)) {
                harga += 500000;
            }
            return harga * jangkaWaktu;
        } else if (mediaPromosi instanceof Baliho) {
            return ((Baliho) mediaPromosi).getHarga() * jangkaWaktu;
        } else if (mediaPromosi instanceof Majalah) {
            Majalah majalah = (Majalah) mediaPromosi;
            int harga = majalah.getHarga();
            if (majalah.getBidang().equals(bidang)) {
                harga += 200000;
            }
            return harga * jangkaWaktu;
        } else {
            return 0;
        }
    }
}
