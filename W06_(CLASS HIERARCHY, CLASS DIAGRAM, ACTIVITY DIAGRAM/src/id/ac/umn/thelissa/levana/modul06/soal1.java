package id.ac.umn.thelissa.levana.modul06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Handphone> handphones = new ArrayList<>();
        List<Voucher> vouchers = new ArrayList<>();
        List<Order> orders = new ArrayList<>();

        Handphone handphone = new Handphone(1, "Cengchun S23 Ultra", 15000000, 10, "Hitam");
        handphones.add(handphone);
        Voucher voucher = new Voucher(1, "Spotify 1Year Subscription", 250000, 5, 25000);
        vouchers.add(voucher);

        while (true) {
            System.out.println("-------Menu Toko Voucher & HP-------");
            System.out.println("1. Pesan Barang");
            System.out.println("2. Lihat Pesanan");
            System.out.println("3. Barang Baru");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    pesanBarang(handphones, vouchers, orders, scanner);
                    break;
                case 2:
                    lihatPesanan(orders);
                    break;
                case 3:
                    tambahBarang(handphones, vouchers, scanner);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    private static void pesanBarang(List<Handphone> handphones, List<Voucher> vouchers, List<Order> orders,
            Scanner scanner) {
        System.out.println("Daftar Barang Toko Voucher & HP");
        System.out.println("1. Handphone");
        System.out.println("2. Voucher");
        System.out.print("Pilihan: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            for (Handphone handphone : handphones) {
                System.out.println("ID     : " + handphone.getId());
                System.out.println("Nama   : " + handphone.getNama() + " " + handphone.getWarna());
                System.out.println("Stock  : " + handphone.getStock());
                System.out.println("Harga  : " + handphone.getHarga());
                System.out.println("-----------------------------------------");
            }
        } else if (choice == 2) {
            for (Voucher voucher : vouchers) {
                System.out.println("ID     : " + voucher.getId());
                System.out.println("Nama   : " + voucher.getNama());
                System.out.println("Stock  : " + voucher.getStock());
                System.out.println("Harga  : " + voucher.getHarga());
                System.out.println("-----------------------------------------");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        System.out.println("Ketik 0 untuk batal");
        System.out.print("Pesan Barang (ID): ");
        int idBarang = scanner.nextInt();

        if (idBarang == 0) {
            return;
        }

        if (choice == 1) {
            Handphone selectedHandphone = null;
            for (Handphone handphone : handphones) {
                if (handphone.getId() == idBarang) {
                    selectedHandphone = handphone;
                    break;
                }
            }

            if (selectedHandphone != null) {
                System.out.print("Masukkan Jumlah: ");
                int jumlah = scanner.nextInt();

                if (jumlah > 0 && jumlah <= selectedHandphone.getStock()) {
                    int totalHarga = jumlah * selectedHandphone.getHarga();
                    System.out.println("Total Harga: " + totalHarga);
                    System.out.print("Masukkan Harga: ");
                    int harga = scanner.nextInt();
                    if (harga < totalHarga) {
                        System.out.println("Jumlah uang tidak mencukupi.");
                        return;
                    }
                    selectedHandphone.kurangiStock(jumlah);
                    Order order = new Order(idBarang, selectedHandphone, jumlah, totalHarga);
                    orders.add(order);
                    System.out.println("Berhasil dipesan");
                } else {
                    System.out.println("Stok tidak mencukupi");
                }
            } else {
                System.out.println("Barang tidak ditemukan.");
            }
        } else if (choice == 2) {
            Voucher selectedVoucher = null;
            for (Voucher voucher : vouchers) {
                if (voucher.getId() == idBarang) {
                    selectedVoucher = voucher;
                    break;
                }
            }

            if (selectedVoucher != null) {
                System.out.print("Masukkan Jumlah: ");
                int jumlah = scanner.nextInt();

                if (jumlah > 0 && jumlah <= selectedVoucher.getStock()) {
                    int totalValue = jumlah * selectedVoucher.getHarga() + jumlah * selectedVoucher.getPajak();
                    System.out.println("Total Harga(PPN Inc): " + totalValue);
                    System.out.print("Masukkan Harga: ");
                    int harga = scanner.nextInt();
                    if (harga < totalValue) {
                        System.out.println("Jumlah uang tidak mencukupi.");
                        return;
                    }
                    selectedVoucher.kurangiStock(jumlah);
                    Order order = new Order(idBarang, selectedVoucher, jumlah, totalValue);
                    orders.add(order);
                    System.out.println("Berhasil dipesan");
                } else {
                    System.out.println("Stok tidak mencukupi");
                }
            } else {
                System.out.println("Barang tidak ditemukan.");
            }
        }
    }

    private static void lihatPesanan(List<Order> orders) {
        System.out.println("Daftar Pesanan Toko Voucher & HP");
        for (Order order : orders) {
            System.out.println("ID     : " + order.getIdBarang());
            if (order.getHandphone() != null) {
                System.out
                        .println("Nama   : " + order.getHandphone().getNama() + " " + order.getHandphone().getWarna());
                System.out.println("Jumlah : " + order.getJumlah());
                System.out.println("Total  : " + order.getTotalHarga());
            } else if (order.getVoucher() != null) {
                System.out.println("Nama   : " + order.getVoucher().getNama());
                System.out.println("Total  : " + order.getTotalHarga());
            }
            System.out.println();
        }
    }

    private static void tambahBarang(List<Handphone> handphones, List<Voucher> vouchers, Scanner scanner) {
        System.out.print("Voucher / Handphone (V/H): ");
        String choice2 = scanner.next();

        if (choice2.equalsIgnoreCase("H")) {
            System.out.print("ID    : ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nama  : ");
            String nama = scanner.nextLine();

            System.out.print("Harga : ");
            int harga = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Stock : ");
            int stock = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Warna : ");
            String warna = scanner.next();
            scanner.nextLine();

            Handphone handphone = new Handphone(id, nama, harga, stock, warna);
            handphones.add(handphone);
            System.out.println("Handphone telah berhasil diinput");
        } else if (choice2.equalsIgnoreCase("V")) {
            System.out.print("ID     : ");
            int id = scanner.nextInt();
            System.out.print("Nama   : ");
            String nama = scanner.next();
            scanner.nextLine();

            System.out.print("Harga  : ");
            int harga = scanner.nextInt();
            System.out.print("Stock  : ");
            int stock = scanner.nextInt();
            System.out.print("PPN(%) : ");
            int ppn = scanner.nextInt();

            int pajak = harga * ppn / 100;
            Voucher voucher = new Voucher(id, nama, harga, stock, pajak);
            vouchers.add(voucher);
            System.out.println("Voucher telah berhasil diinput");
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}
