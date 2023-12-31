package id.ac.umn.thelissa.levana.modul02;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan bulan (1-12) : ");
            int nomorBulan = input.nextInt();

            String namaBulan;
            int jumlahHari;

            switch (nomorBulan) {
                case 1:
                    namaBulan = "Januari";
                    jumlahHari = 31;
                    break;
                case 2:
                    namaBulan = "Februari";
                    jumlahHari = 28;
                    break;
                case 3:
                    namaBulan = "Maret";
                    jumlahHari = 31;
                    break;
                case 4:
                    namaBulan = "April";
                    jumlahHari = 30;
                    break;
                case 5:
                    namaBulan = "Mei";
                    jumlahHari = 31;
                    break;
                case 6:
                    namaBulan = "Juni";
                    jumlahHari = 30;
                    break;
                case 7:
                    namaBulan = "Juli";
                    jumlahHari = 31;
                    break;
                case 8:
                    namaBulan = "Agustus";
                    jumlahHari = 31;
                    break;
                case 9:
                    namaBulan = "September";
                    jumlahHari = 30;
                    break;
                case 10:
                    namaBulan = "Oktober";
                    jumlahHari = 31;
                    break;
                case 11:
                    namaBulan = "November";
                    jumlahHari = 30;
                    break;
                case 12:
                    namaBulan = "Desember";
                    jumlahHari = 31;
                    break;
                default:
                    System.out.println("Nomor bulan tidak valid.");
                    return;
            }

            System.out.println("Bulan " + namaBulan + " memiliki " + jumlahHari + " hari.");
        }
    }
}
