package id.ac.umn.thelissa.levana.modul03;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. CharAt");
            System.out.println("2. Length");
            System.out.println("3. Substring(n)");
            System.out.println("4. Substring(m,n)");
            System.out.println("5. Contains");
            System.out.println("6. Concat");
            System.out.println("7. Replace");
            System.out.println("8. Split");
            System.out.println("9. Lowercase");
            System.out.println("10. Uppercase");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-10): ");
            pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan indeks: ");
                    int indeks = scanner.nextInt();
                    if (indeks >= 0 && indeks < nama.length()) {
                        char karakter = nama.charAt(indeks);
                        System.out.println("Karakter di indeks " + indeks + ": " + karakter);
                    } else {
                        System.out.println("Indeks tidak valid.");
                    }
                    break;
                case 2:
                    int panjang = nama.length();
                    System.out.println("Panjang string: " + panjang);
                    break;
                case 3:
                    System.out.print("Masukkan nilai n: ");
                    int n = scanner.nextInt();
                    if (n >= 0 && n <= nama.length()) {
                        String substringN = nama.substring(n);
                        System.out.println("Substring dari indeks " + n + " hingga akhir: " + substringN);
                    } else {
                        System.out.println("Nilai n tidak valid.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nilai m: ");
                    int m = scanner.nextInt();
                    System.out.print("Masukkan nilai n: ");
                    int n2 = scanner.nextInt();
                    if (m >= 0 && m <= nama.length() && n2 >= 0 && n2 <= nama.length() && m <= n2) {
                        String substringMN = nama.substring(m, n2);
                        System.out.println("Substring dari indeks " + m + " hingga " + n2 + ": " + substringMN);
                    } else {
                        System.out.println("Nilai m dan n tidak valid.");
                    }
                    break;
                case 5:
                    System.out.print("Masukkan substring yang ingin dicari: ");
                    String substring = scanner.next();
                    boolean containsSubstring = nama.contains(substring);
                    System.out.println("Mengandung substring \"" + substring + "\": " + containsSubstring);
                    break;
                case 6:
                    System.out.print("Masukkan string yang akan digabungkan: ");
                    String stringToConcat = scanner.next();
                    String hasilConcat = nama.concat(stringToConcat);
                    System.out.println("Hasil penggabungan: " + " " + hasilConcat);
                    break;
                case 7:
                    System.out.print("Masukkan substring yang ingin diganti: ");
                    String substringToReplace = scanner.next();
                    System.out.print("Masukkan substring pengganti: ");
                    String replacement = scanner.next();
                    String hasilReplace = nama.replace(substringToReplace, replacement);
                    System.out.println("Hasil penggantian: " + hasilReplace);
                    break;
                case 8:
                    System.out.print("Masukkan delimiter untuk split: ");
                    String delimiter = scanner.next();
                    String[] hasilSplit = nama.split(delimiter);
                    System.out.print("Hasil split: ");
                    for (String s : hasilSplit) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                    break;
                case 9:
                    String lowercase = nama.toLowerCase();
                    System.out.println("Huruf kecil: " + lowercase);
                    break;
                case 10:
                    String uppercase = nama.toUpperCase();
                    System.out.println("Huruf besar: " + uppercase);
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
                    break;
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
