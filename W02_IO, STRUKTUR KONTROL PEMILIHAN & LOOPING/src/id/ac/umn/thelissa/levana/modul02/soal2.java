package id.ac.umn.thelissa.levana.modul02;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        input.close();

        boolean isPrime = isAngkaPrima(angka);

        if (isPrime) {
            System.out.println(angka + " adalah angka prima.");
        } else {
            System.out.println(angka + " bukan angka prima.");
        }
    }

    public static boolean isAngkaPrima(int angka) {
        if (angka <= 1) {
            return false;
        }

        if (angka <= 3) {
            return true;
        }

        if (angka % 2 == 0 || angka % 3 == 0) {
            return false;
        }

        int divisor = 5;
        while (divisor * divisor <= angka) {
            if (angka % divisor == 0 || angka % (divisor + 2) == 0) {
                return false;
            }
            divisor += 6;
        }

        return true;
    }
}
