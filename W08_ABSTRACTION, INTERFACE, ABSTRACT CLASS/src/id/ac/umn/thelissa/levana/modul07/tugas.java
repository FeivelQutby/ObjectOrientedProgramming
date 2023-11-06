package id.ac.umn.thelissa.levana.modul07;

import java.util.ArrayList;
import java.util.Scanner;

public class tugas {
    static ArrayList<Item> listOfItems = new ArrayList<>();
    static ArrayList<Payment> listOfPayments = new ArrayList<>();
    static Scanner s = new Scanner(System.in);

    public static void seedData() {
        listOfItems.add(new Item("Kulkas", "Electronic", 4800000));
        listOfItems.add(new Item("TV", "Electronic", 1280000));
        listOfItems.add(new Item("Laptop", "Computer", 6000000));
        listOfItems.add(new Item("PC", "Computer", 12000000));
        listOfItems.add(new Item("Cengchun S23 Ultra", "Smartphone", 15000000));
        listOfItems.add(new Item("Iphong 15 Pro", "Smartphone", 16500000));
    }

    public static void printItem(Item item) {
        System.out.println("Nama  : " + item.getName());
        System.out.println("Tipe  : " + item.getType());
        System.out.println("Harga : " + item.getPrice());
    }

    public static void main(String[] args) {
        int opt = 0;
        seedData();
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("----Program Toko Elektronik----");
            System.out.println("1. Pesan Barang");
            System.out.println("2. Lihat Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilihan : ");
            opt = s.nextInt();
            if (opt == 1) {
                System.out.println("----Daftar Barang----");
                for (int i = 0; i < listOfItems.size(); i++) {
                    System.out.println("No    : " + (i + 1));
                    printItem(listOfItems.get(i));
                    System.out.println("------------------------");
                }
                System.out.print("Pilih (No): ");
                int selectedItemNo = s.nextInt();
                if (selectedItemNo > 0 && selectedItemNo <= listOfItems.size()) {
                    Item selecteditem = listOfItems.get(selectedItemNo - 1);
                    System.out.println("Pilih metode pembayaran:");
                    System.out.println("1. Cash");
                    System.out.println("2. Credit");
                    System.out.print("Pilihan : ");
                    int paymentMethod = s.nextInt();
                    if (paymentMethod == 1) {
                        System.out.print("Bayar (Y/N): ");
                        String payNowOption = s.next();
                        if (payNowOption.equalsIgnoreCase("Y")) {
                            Cash cashPayment = new Cash(selecteditem);
                            int paymentAmount = cashPayment.pay();
                            System.out.println("Harga Pembayaran : " + selecteditem.getPrice());
                            System.out.print("Bayar : ");
                            paymentAmount = s.nextInt();
                            if (paymentAmount == selecteditem.getPrice()) {
                                System.out.println("Transaksi telah dibayar lunas.");
                                listOfPayments.add(cashPayment);
                            } else {
                                System.out.println("Pembayaran Kurang atau lebih");
                            }
                        } else if (payNowOption.equalsIgnoreCase("N")) {
                            System.out.println("Transaksi tersimpan.");
                            listOfPayments.add(new Cash(selecteditem));
                        } else {
                            System.out.println("Input tidak valid.");
                        }
                    } else if (paymentMethod == 2) {
                        boolean loop = true;
                        int maxInstallmentAmount = 0;
                        while (loop) {
                            System.out.print("Lama Cicilan (3/6/9/12): ");
                            int creditDuration = s.nextInt();
                            switch (creditDuration) {
                                case 3:
                                    maxInstallmentAmount = 3;
                                    loop = false;
                                    break;
                                case 6:
                                    maxInstallmentAmount = 6;
                                    loop = false;
                                    break;
                                case 9:
                                    maxInstallmentAmount = 9;
                                    loop = false;
                                    break;
                                case 12:
                                    maxInstallmentAmount = 12;
                                    loop = false;
                                    break;
                            }
                        }
                        Credit creditPayment = new Credit(selecteditem, maxInstallmentAmount);
                        System.out.println("Harga Pembayaran : " + creditPayment.pay());
                        System.out.print("Bayar : ");
                        int firstPaymentAmount = s.nextInt();
                        if (firstPaymentAmount == creditPayment.pay()) {
                            System.out.println("Transaksi dibayar.");
                            listOfPayments.add(creditPayment);
                        } else {
                            System.out.println("Pembayaran Kurang atau lebih");
                        }
                    } else {
                        System.out.println("Input tidak valid.");
                    }
                } else {
                    System.out.println("Nomor barang tidak valid.");
                }
            } else if (opt == 2) {
                System.out.println("----Daftar Pesanan----");
                if (listOfPayments.isEmpty()) {
                    System.out.println("Belum ada pesanan.");
                } else {
                    for (int i = 0; i < listOfPayments.size(); i++) {
                        System.out.println("No              : " + (i + 1));
                        Payment payment = listOfPayments.get(i);
                        System.out.println("Nama            : " + payment.getItemName());
                        System.out.println("Tipe            : " + payment.getItemType());
                        System.out.println("Status          : " + payment.getStatus());
                        System.out.println("Sisa Pembayaran : " + payment.getRemainingAmount());
                        System.out.println("--------------------------------");
                    }
                    System.out.print("Pilih No transaksi: ");
                    int selectedTransaction = s.nextInt();
                    if (selectedTransaction > 0 && selectedTransaction <= listOfPayments.size()) {
                        Payment selectedPayment = listOfPayments.get(selectedTransaction - 1);
                        if ("ON PROGRESS".equals(selectedPayment.getStatus())) {
                            int remainingAmount = selectedPayment.getRemainingAmount();
                            if (remainingAmount == 0) {
                                System.out.println("Transaksi ini sudah dibayar lunas.");
                            } else {
                                System.out.println("Sisa Pembayaran  : " + remainingAmount);
                                int bayarcicilan = remainingAmount / selectedPayment.getRemainingAmount();
                                System.out.println("Harga Pembayaran : " + remainingAmount);
                                System.out.print("Bayar : ");
                                int paymentAmount = s.nextInt();
                                if (paymentAmount == bayarcicilan) {
                                    selectedPayment.pay();
                                    System.out.println("Transaksi telah dibayar");
                                } else {
                                    System.out.println("Pembayaran Kurang atau lebih");
                                }
                            }
                        } else {
                            System.out.println("Transaksi ini sudah dibayar lunas.");
                        }
                    } else if (selectedTransaction == 0) {
                        // Kembali ke menu utama
                    } else {
                        System.out.println("Nomor transaksi tidak valid.");
                    }
                }
            } else if (opt != 0) {
                System.out.println("Salah Input");
            }
        } while (opt != 0);
        s.close();
    }
}
