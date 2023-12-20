package id.ac.umn.thelissa.levana.modul09;

import java.util.ArrayList;
import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Karyawan> daftarManager = new ArrayList<>();
        ArrayList<Karyawan> daftarTetap = new ArrayList<>();
        ArrayList<Karyawan> daftarMagang = new ArrayList<>();

        while (true) {
            System.out.println("-------Program Data Karyawan-------");
            System.out.println("1. Lihat Karyawan");
            System.out.println("2. Tambah Karyawan");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 2:
                    System.out.println("-----Tambah Karyawan-----");
                    System.out.println("1. Manager");
                    System.out.println("2. Karyawan Tetap");
                    System.out.println("3. Karyawan Magang");
                    System.out.print("Pilih: ");
                    int status = input.nextInt();

                    Karyawan karyawan = null;
                    switch (status) {
                        case 1:
                            System.out.print("Nama : ");
                            String nama = input.next();
                            karyawan = createManager(nama);
                            daftarManager.add(karyawan);
                            System.out.println("Manager baru telah ditambahkan.");
                            break;
                        case 2:
                            System.out.print("Nama : ");
                            String nama2 = input.next();
                            karyawan = createTetap(nama2);
                            daftarTetap.add(karyawan);
                            System.out.println("Karyawan tetap baru telah ditambahkan.");
                            break;
                        case 3:
                            System.out.print("Nama : ");
                            String nama3 = input.next();
                            karyawan = createMagang(nama3);
                            daftarMagang.add(karyawan);
                            System.out.println("Karyawan magang baru telah ditambahkan.");
                            break;
                        default:
                            System.out.println("Status karyawan tidak valid.");
                            break;
                    }
                    break;

                case 1:
                    System.out.println("-----Daftar Manager-----");
                    for (Karyawan k : daftarManager) {
                        System.out.println("ID   : " + k.getId());
                        System.out.println("Nama : " + k.getNama());
                        if (k.getGaji() == 10000000) {
                            String gaji = "Rp. 10.000.000,00";
                            System.out.println("Gaji : " + gaji);
                        }
                        System.out.println();
                    }

                    System.out.println("-----Daftar Pegawai Tetap-----");
                    for (Karyawan k : daftarTetap) {
                        System.out.println("ID   : " + k.getId());
                        System.out.println("Nama : " + k.getNama());
                        if (k.getGaji() == 3000000) {
                            String gaji = "Rp. 3.000.000,00";
                            System.out.println("Gaji : " + gaji);
                        }
                        System.out.println();
                    }

                    System.out.println("-----Daftar Pegawai Magang-----");
                    for (Karyawan k : daftarMagang) {
                        System.out.println("ID   : " + k.getId());
                        System.out.println("Nama : " + k.getNama());
                        if (k.getGaji() == 1500000) {
                            String gaji = "Rp. 1.500.000,00";
                            System.out.println("Gaji : " + gaji);
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih!");
                    input.close();
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    private static Manager createManager(String nama) {
        return new Manager(generateId("Manager"), nama);
    }

    private static Tetap createTetap(String nama) {
        return new Tetap(generateId("Karyawan Tetap"), nama);
    }

    private static Magang createMagang(String nama) {
        return new Magang(generateId("Karyawan Magang"), nama);
    }

    private static int managerCount = 0;
    private static int tetapCount = 0;
    private static int magangCount = 0;

    private static String generateId(String status) {
        String id = "";
        switch (status) {
            case "Manager":
                managerCount++;
                id = "M" + managerCount;
                break;
            case "Karyawan Tetap":
                tetapCount++;
                id = "R" + tetapCount;
                break;
            case "Karyawan Magang":
                magangCount++;
                id = "I" + magangCount;
                break;
        }
        return id;
    }
}
