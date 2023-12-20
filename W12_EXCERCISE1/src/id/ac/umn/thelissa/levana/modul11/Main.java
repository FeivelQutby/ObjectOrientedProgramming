package id.ac.umn.thelissa.levana.modul11;

import java.util.Scanner;
import java.util.ArrayList;

import java.text.SimpleDateFormat;
import java.util.Date;
// ^ buat minta tanggal hari ini (untuk cek apakah order bisa dibatalkan atau tidak)

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aktor> aktorList = new ArrayList<>();
        aktorList.add(new Aktor("Chris Evans", 200000000, 30, 170, 60, 100000, "Captain America Lovers"));
        aktorList.add(new Aktor("Robert Downey Jr", 270000000, 31, 171, 61, 120000, "Ironman Lovers"));
        aktorList.add(new Aktor("Chris Hemsworth", 250000000, 32, 172, 62, 140000, "Thor Lovers"));

        ArrayList<Celebgram> celebgramList = new ArrayList<>();
        celebgramList.add(new Celebgram("Awkarin", 1000000, 25, 165, 45, 100000, "Instagram",
                "Furnitur"));
        celebgramList.add(new Celebgram("Anya Geraldine", 2000000, 26, 166, 46, 120000, "Twitter", "Makanan"));
        celebgramList.add(new Celebgram("Devina Aurel", 3000000, 27, 167, 47, 140000, "Youtube", "Tanaman"));

        ArrayList<Baliho> balihoList = new ArrayList<>();
        balihoList.add(new Baliho("Baliho Jakarta Pusat", 18000000, 6, "Jakarta Pusat"));
        balihoList.add(new Baliho("Baliho Jakarta Barat", 24000000, 8, "Jakarta Barat"));
        balihoList.add(new Baliho("Baliho Jakarta Utara", 27000000, 9, "Jakarta Utara"));

        ArrayList<Majalah> majalahList = new ArrayList<>();
        majalahList.add(new Majalah("Home Decor", 750000, 15, "Halaman 2", "Furnitur"));
        majalahList.add(new Majalah("Sedap", 900000, 18, "Halaman 3", "Makanan"));
        majalahList.add(new Majalah("Otomotif", 1050000, 21, "Halaman 4", "Tanaman"));

        ArrayList<Order> ordersList = new ArrayList<>();
        while (true) {
            System.out.println("===============================");
            System.out.println("     Wemen Marketing Agent     ");
            System.out.println("===============================");
            System.out.println("1. Penambahan Media");
            System.out.println("2. Penyewaan Media");
            System.out.println("3. Check Employment / Rental");
            System.out.println("4. Credits");
            System.out.println("5. Exit");
            System.out.println("===============================");
            System.out.print("Pilih Menu (1-5): ");
            int pilih = scanner.nextInt();
            scanner.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("===============================");
                    System.out.println("     Wemen Marketing Agent     ");
                    System.out.println("===============================");
                    System.out.println("1. Celebgram");
                    System.out.println("2. Majalah");
                    System.out.println("===============================");
                    System.out.print("Pilih Media (1-2): ");
                    int pilihMedia = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("===============================");
                    System.out.println("1. Furnitur");
                    System.out.println("2. Makanan");
                    System.out.println("3. Tanaman");
                    System.out.println("4. Otomotif");
                    System.out.println("5. Musik");
                    System.out.println("===============================");
                    System.out.print("Pilih Kategori (1-5): ");
                    int pilihKategori = scanner.nextInt();
                    scanner.nextLine();

                    String selectedKategori2;
                    if (pilihKategori == 1) {
                        selectedKategori2 = "Furnitur";
                    } else if (pilihKategori == 2) {
                        selectedKategori2 = "Makanan";
                    } else if (pilihKategori == 3) {
                        selectedKategori2 = "Tanaman";
                    } else if (pilihKategori == 4) {
                        selectedKategori2 = "Otomotif";
                    } else if (pilihKategori == 5) {
                        selectedKategori2 = "Musik";
                    } else {
                        System.out.println("Pilihan tidak tersedia");
                        break;
                    }

                    if (pilihMedia == 1) {
                        System.out.print("Masukkan Nama : ");
                        String nama = scanner.nextLine();
                        System.out.print("Masukkan Umur : ");
                        int umur = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Masukkan Tinggi Badan : ");
                        int tinggiBadan = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Masukkan Berat Badan : ");
                        int beratBadan = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Masukkan Followers : ");
                        int followers = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Masukkan media sosial yang digunakan : ");
                        String akunMedia = scanner.nextLine();
                        int hargaSewa = followers * 1000;
                        celebgramList.add(new Celebgram(nama, hargaSewa, umur, tinggiBadan, beratBadan, followers,
                                akunMedia, selectedKategori2));
                        System.out.println("Celebgram berhasil ditambahkan");
                    } else if (pilihMedia == 2) {
                        System.out.print("Masukkan Nama : ");
                        String nama = scanner.nextLine();
                        System.out.print("Masukkan Luas : ");
                        int luas = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Masukkan Letak Halaman Promosi : ");
                        String letak = scanner.nextLine();
                        int hargaSewa = luas * 50000;
                        majalahList.add(new Majalah(nama, hargaSewa, luas, letak, selectedKategori2));
                        System.out.println("Majalah berhasil ditambahkan");
                    } else {
                        System.out.println("Pilihan tidak tersedia");
                    }
                    break;
                case 2:
                    System.out.println("===============================");
                    System.out.println("     Wemen Marketing Agent     ");
                    System.out.println("===============================");
                    System.out.println("1. Furnitur");
                    System.out.println("2. Makanan");
                    System.out.println("3. Tanaman");
                    System.out.println("4. Otomotif");
                    System.out.println("5. Musik");
                    System.out.println("===============================");
                    System.out.print("Pilih Kategori (1-5): ");
                    int pilihKategori2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Tanggal mulai (DDMMYYYY) : ");
                    String tanggalMulai = scanner.nextLine();
                    System.out.print("Banyak hari penyewaan : ");
                    int lamaSewa = scanner.nextInt();
                    scanner.nextLine();

                    String selectedKategori;
                    if (pilihKategori2 == 1) {
                        selectedKategori = "Furnitur";
                    } else if (pilihKategori2 == 2) {
                        selectedKategori = "Makanan";
                    } else if (pilihKategori2 == 3) {
                        selectedKategori = "Tanaman";
                    } else if (pilihKategori2 == 4) {
                        selectedKategori = "Otomotif";
                    } else if (pilihKategori2 == 5) {
                        selectedKategori = "Musik";
                    } else {
                        System.out.println("Pilihan tidak tersedia");
                        break;
                    }

                    System.out.println("===============================");
                    System.out.println("     Wemen Marketing Agent     ");
                    System.out.println("===============================");
                    System.out.println("1. Aktor");
                    System.out.println("2. Celebgram");
                    System.out.println("3. Baliho");
                    System.out.println("4. Majalah");
                    System.out.println("===============================");
                    System.out.print("Pilih Media (1-4): ");
                    int pilihMedia2 = scanner.nextInt();
                    scanner.nextLine();

                    switch (pilihMedia2) {
                        case 1:
                            // Tampilkan daftar aktor
                            System.out.println("=============Aktor=============");
                            for (int i = 0; i < aktorList.size(); i++) {
                                System.out.println("No            : " + (i + 1));
                                System.out.println("Media         : Aktor");
                                System.out.println("Nama          : " + aktorList.get(i).getNama());
                                System.out.println("Umur          : " + aktorList.get(i).getUmur());
                                System.out.println("Tinggi        : " + aktorList.get(i).getTinggiBadan());
                                System.out.println("Berat         : " + aktorList.get(i).getBeratBadan());
                                System.out.println("Jumlah Fans   : " + aktorList.get(i).getFans());
                                System.out.println("Nama Fansclub : " + aktorList.get(i).getFanClub());
                                System.out.println("Harga         : " + aktorList.get(i).getHarga());
                                System.out.println("===============================");
                            }
                            System.out.print("Pilih Aktor(1-" + aktorList.size() + ") : ");
                            int pilihAktor = scanner.nextInt();
                            scanner.nextLine();
                            Aktor selectedAktor = aktorList.get(pilihAktor - 1);

                            System.out.println("Total bayar : " + selectedAktor.getHarga() * lamaSewa);
                            System.out.print("Masukkan uang untuk pembayaran : ");
                            int uang = scanner.nextInt();
                            scanner.nextLine();

                            if (uang < selectedAktor.getHarga() * lamaSewa) {
                                System.out.println("Uang tidak mencukupi");
                                break;
                            } else {
                                System.out.println("Pemesanan berhasil");
                                ordersList.add(new Order(selectedAktor, selectedKategori, tanggalMulai, lamaSewa));
                            }
                            break;
                        case 2:
                            // Tampilkan daftar celebgram
                            System.out.println("===========Celebgram===========");
                            for (int j = 0; j < celebgramList.size(); j++) {
                                System.out.println("No           : " + (j + 1));
                                System.out.println("Media        : Celebgram");
                                System.out.println("Nama         : " + celebgramList.get(j).getNama());
                                System.out.println("Umur         : " + celebgramList.get(j).getUmur());
                                System.out.println("Tinggi       : " + celebgramList.get(j).getTinggiBadan());
                                System.out.println("Berat        : " + celebgramList.get(j).getBeratBadan());
                                System.out.println("Followers    : " + celebgramList.get(j).getFollowers());
                                System.out.println("Social media : " + celebgramList.get(j).getAkunMedia());
                                System.out.println("Kategori     : " + celebgramList.get(j).getBidang());
                                System.out.println("Harga        : " + celebgramList.get(j).getHarga());
                                System.out.println("===============================");
                            }
                            System.out.print("Pilih Celebgram(1-" + celebgramList.size() + ") : ");
                            int pilihCeleb = scanner.nextInt();
                            scanner.nextLine();
                            Celebgram selectedCeleb = celebgramList.get(pilihCeleb - 1);

                            int harga = selectedCeleb.getHarga();
                            if (selectedCeleb.getBidang() == selectedKategori) {
                                harga = selectedCeleb.getHarga() + 500000;
                            }

                            System.out.println("Total bayar : " + harga * lamaSewa);
                            System.out.print("Masukkan uang untuk pembayaran : ");
                            int uang2 = scanner.nextInt();
                            scanner.nextLine();

                            if (uang2 < harga * lamaSewa) {
                                System.out.println("Uang tidak mencukupi");
                                break;
                            } else {
                                System.out.println("Pemesanan berhasil");
                                ordersList.add(new Order(selectedCeleb, selectedKategori, tanggalMulai, lamaSewa));
                            }
                            break;
                        case 3:
                            // Tampilkan daftar baliho
                            System.out.println("=============Baliho============");
                            for (int k = 0; k < balihoList.size(); k++) {
                                System.out.println("No    : " + (k + 1));
                                System.out.println("Nama  : " + balihoList.get(k).getNama());
                                System.out.println("Letak : " + balihoList.get(k).getLetak());
                                System.out.println("Luas  : " + balihoList.get(k).getLuas());
                                System.out.println("Harga : " + balihoList.get(k).getHarga());
                                System.out.println("===============================");
                            }
                            System.out.print("Pilih Baliho(1-" + aktorList.size() + ") : ");
                            int pilihBaliho = scanner.nextInt();
                            scanner.nextLine();
                            Baliho selectedBaliho = balihoList.get(pilihBaliho - 1);

                            System.out.println("Total bayar : " + selectedBaliho.getHarga() * lamaSewa);
                            System.out.print("Masukkan uang untuk pembayaran : ");
                            int uang3 = scanner.nextInt();
                            scanner.nextLine();

                            if (uang3 < selectedBaliho.getHarga() * lamaSewa) {
                                System.out.println("Uang tidak mencukupi");
                                break;
                            } else {
                                System.out.println("Pemesanan berhasil");
                                ordersList.add(new Order(selectedBaliho, selectedKategori, tanggalMulai, lamaSewa));
                            }
                            break;
                        case 4:
                            // Tampilkan daftar majalah
                            System.out.println("============Majalah============");
                            for (int l = 0; l < majalahList.size(); l++) {
                                System.out.println("No       : " + (l + 1));
                                System.out.println("Nama     : " + majalahList.get(l).getNama());
                                System.out.println("Luas     : " + majalahList.get(l).getLuas());
                                System.out.println("Halaman  : " + majalahList.get(l).getLetak());
                                System.out.println("Kategori : " + majalahList.get(l).getBidang());
                                System.out.println("===============================");
                            }
                            System.out.print("Pilih Majalah(1-" + celebgramList.size() + ") : ");
                            int pilihMajalah = scanner.nextInt();
                            scanner.nextLine();
                            Majalah selectedMajalah = majalahList.get(pilihMajalah - 1);

                            int harga2 = selectedMajalah.getHarga();
                            if (selectedMajalah.getBidang() == selectedKategori) {
                                harga2 = selectedMajalah.getHarga() + 200000;
                            }

                            System.out.println("Total bayar : " + harga2 * lamaSewa);
                            System.out.print("Masukkan uang untuk pembayaran : ");
                            int uang4 = scanner.nextInt();
                            scanner.nextLine();

                            if (uang4 < harga2 * lamaSewa) {
                                System.out.println("Uang tidak mencukupi");
                                break;
                            } else {
                                System.out.println("Pemesanan berhasil");
                                ordersList.add(new Order(selectedMajalah, selectedKategori, tanggalMulai, lamaSewa));
                            }
                            break;
                        default:
                            System.out.println("Pilihan tidak tersedia");
                            break;
                    }
                    break;
                case 3:
                    if (ordersList.isEmpty()) {
                        System.out.println("Tidak ada order untuk ditampilkan.");
                        break;
                    }
                    System.out.println("===============================");
                    System.out.println("     Wemen Marketing Agent     ");
                    System.out.println("===============================");
                    for (int m = 0; m < ordersList.size(); m++) {
                        Order order = ordersList.get(m);
                        System.out.println("No          : " + (m + 1));
                        System.out.println("Media       : " + order.getMediaPromosi());
                        System.out.println("Nama        : " + order.getNama());
                        System.out.println("Tanggal     : " + order.getTanggal());
                        System.out.println("Durasi      : " + order.getJangkaWaktu() + " hari");
                        System.out.println("Total Bayar : " + order.getTotalBayar());
                        System.out.println("===============================");
                    }
                    System.out.println("1. Batalkan Order");
                    System.out.println("2. Kembali ke menu utama");
                    System.out.println("===============================");
                    System.out.print("Pilih Menu (1-2): ");
                    int pilihMenu = scanner.nextInt();
                    scanner.nextLine();

                    switch (pilihMenu) {
                        case 1:
                            System.out.print("Pilih order yang ingin dibatalkan : ");
                            int pilihOrder = scanner.nextInt();
                            scanner.nextLine();

                            if (pilihOrder >= 1 && pilihOrder <= ordersList.size()) {
                                Order batalPesanan = ordersList.get(pilihOrder - 1);

                                if (mintaTanggal(batalPesanan.getTanggal())) {
                                    System.out.println("Pesanan tidak dapat dibatalkan.");
                                } else {
                                    System.out.println("Pesanan berhasil dibatalkan.");
                                    ordersList.remove(pilihOrder - 1);
                                }
                            } else {
                                System.out.println("Order tidak ditemukan.");
                            }
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("Pilihan tidak tersedia");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("===============================");
                    System.out.println("     Wemen Marketing Agent     ");
                    System.out.println("===============================");
                    System.out.println(" Name : Thelissa Levana Zheng");
                    System.out.println(" NIM  : 00000075569");
                    System.out.println("===============================");
                    System.out.println("Tekan ENTER untuk melanjutkan");
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.println("Exitting...");
                    scanner.close();
                    System.exit(0);
                default:
                    break;
            }

        }
    }

    private static boolean mintaTanggal(String dateStr) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("DDMMYYYY");
            Date currentDate = new Date();
            Date orderDate = sdf.parse(dateStr);
            return orderDate.after(currentDate);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}