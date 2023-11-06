package id.ac.umn.thelissa.levana.modul05;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println("------Program Menghitung Bangun Ruang------");
            System.out.println("1. Lingkaran");
            System.out.println("2. Persegi");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Segitiga");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 2:
                    System.out.println("---------Persegi---------");
                    System.out.print("Masukkan panjang sisi : ");
                    double sisiPersegi = input.nextDouble();

                    Persegi persegi = new Persegi(sisiPersegi, "Merah");
                    System.out.println("Warna                 : " + persegi.getWarna());
                    System.out.println("Panjang Sisi          : " + sisiPersegi);
                    System.out.println("Luas                  : " + persegi.hitungLuas());
                    System.out.println("Keliling              : " + persegi.hitungKeliling());
                    break;
                case 1:
                    System.out.println("------------Lingkaran------------");
                    System.out.print("Masukkan jari-jari : ");
                    double jariJari = input.nextDouble();
                    Circle lingkaran = new Circle(jariJari, "Biru");
                    System.out.println("Warna              : " + lingkaran.getWarna());
                    System.out.println("Jari-jari          : " + jariJari);
                    System.out.println("Luas               : " + lingkaran.hitungLuas());
                    System.out.println("Keliling           : " + lingkaran.hitungKeliling());
                    break;
                case 4:
                    System.out.println("---------Segitiga Siku-siku---------");
                    System.out.print("Masukkan alas   : ");
                    double alasSegitiga = input.nextDouble();
                    System.out.print("Masukkan tinggi : ");
                    double tinggiSegitiga = input.nextDouble();
                    SegitigaSikuSiku segitiga = new SegitigaSikuSiku(alasSegitiga, tinggiSegitiga, "Hitam");
                    System.out.println("Warna           : " + segitiga.getWarna());
                    System.out.println("Luas            : " + segitiga.hitungLuas());
                    System.out.println("Keliling        : " + segitiga.hitungKeliling());
                    break;
                case 3:
                    System.out.println("---------Persegi Panjang---------");
                    System.out.print("Masukkan panjang : ");
                    double panjangPersegiPanjang = input.nextDouble();
                    System.out.print("Masukkan lebar   : ");
                    double lebarPersegiPanjang = input.nextDouble();

                    PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang,
                            "Ungu");
                    System.out.println("Warna            : " + persegiPanjang.getWarna());
                    System.out.println("Panjang & Lebar  : " + panjangPersegiPanjang + " & " + lebarPersegiPanjang);
                    System.out.println("Luas             : " + persegiPanjang.hitungLuas());
                    System.out.println("Keliling         : " + persegiPanjang.hitungKeliling());
                    break;
                case 5:
                    loop = false;
                    System.out.println("Keluar program...");
                    break;
                default:
                    System.out.println("Input tidak valid.");
            }
        }
        input.close();
    }
}