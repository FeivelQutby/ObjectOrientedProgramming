package id.ac.umn.thelissa.levana.modul02;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nilai terkecil : ");
            int min = input.nextInt();

            System.out.print("Masukkan nilai terbesar : ");
            int max = input.nextInt();

            int sum = 0;

            for (int number = min; number <= max; number++) {
                if (isPrime(number)) {
                    sum += number;
                }
            }

            System.out.println("Jumlah dari semua bilangan prima antara " + min + " dan " + max + " adalah " + sum);
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
