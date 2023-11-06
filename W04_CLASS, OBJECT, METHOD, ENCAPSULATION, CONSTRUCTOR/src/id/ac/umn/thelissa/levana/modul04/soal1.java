package id.ac.umn.thelissa.levana.modul04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soal1 {
    private static List<Barang> daftarBarang = new ArrayList<>();
    private static List<Pesanan> daftarPesanan = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        daftarBarang.add(new Barang(1, "Pulpen Easy Gel 5.0", 120, 2000));
        daftarBarang.add(new Barang(2, "Penggaris 30cm", 30, 5000));
        daftarBarang.add(new Barang(3, "Tipe-x Roller", 30, 7000));
        daftarBarang.add(new Barang(4, "Pensil Mekanik", 50, 5000));
        daftarBarang.add(new Barang(5, "Buku Tulis", 100, 6000));

        while (true) {
            System.out.println("-----------Menu Toko Multiguna---------");
            System.out.println("1. Pesan Barang");
            System.out.println("2. Lihat Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            int pilihanMenu = scanner.nextInt();

            switch (pilihanMenu) {
                case 1:
                    pesanBarang();
                    break;
                case 2:
                    lihatPesanan();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
        }
    }

    private static void pesanBarang() {
        System.out.println("Daftar Barang Toko Multiguna");

        for (Barang barang : daftarBarang) {
            System.out.println("ID     : " + barang.getId());
            System.out.println("Nama   : " + barang.getNama());
            System.out.println("Stock  : " + barang.getStock());
            System.out.println("Harga  : " + barang.getHarga());
            System.out.println("-----------------------------------------");
        }
        System.out.println("Ketik 0 untuk batal");
        System.out.print("Pesan Barang(ID): ");
        int idBarang = scanner.nextInt();

        if (idBarang == 0) {
            return;
        }

        Barang barangDipesan = null;

        for (Barang barang : daftarBarang) {
            if (barang.getId() == idBarang) {
                barangDipesan = barang;
                break;
            }
        }

        if (barangDipesan == null) {
            System.out.println("ID Barang tidak valid.");
            return;
        }

        System.out.print("Masukkan jumlah barang: ");
        int jumlahPesanan = scanner.nextInt();

        if (jumlahPesanan <= 0 || jumlahPesanan > barangDipesan.getStock()) {
            System.out.println("Jumlah barang tidak valid.");
            return;
        }

        double totalValue = jumlahPesanan * barangDipesan.getHarga();
        System.out.println("Total Harga: " + totalValue);

        System.out.print("Masukkan harga barang: ");
        double hargaBarang = scanner.nextDouble();

        if (hargaBarang != totalValue) {
            System.out.println("Jumlah uang tidak mencukupi.");
            return;
        }

        barangDipesan.kurangiStock(jumlahPesanan);
        daftarPesanan.add(new Pesanan(idBarang, barangDipesan.getNama(), jumlahPesanan, hargaBarang));
        System.out.println("Berhasil dipesan.");
    }

    private static void lihatPesanan() {
        System.out.println("Daftar Pesanan Toko Multiguna");
        for (Pesanan pesanan : daftarPesanan) {
            System.out.println("ID     : " + pesanan.getIdBarang());
            System.out.println("Nama   : " + pesanan.getNamaBarang());
            System.out.println("Jumlah : " + pesanan.getJumlah());
            System.out.println("Total  : " + pesanan.getTotalBiaya());
        }
    }
}
