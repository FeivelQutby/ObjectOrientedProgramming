package id.ac.umn.thelissa.levana.modul05;

import java.util.Scanner;

public class tutorial1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran : ");
        double radius = s.nextDouble();
        System.out.print("Warna : ");
        String color = s.next();

        Circle circle = new Circle(radius, color);
        System.out.println("-----------Lingkaran-----------");
        System.out.println("Warna : " + circle.getWarna());
        System.out.println("Jari-Jari : " + circle.getRadius());
        System.out.println("Keliling : " + circle.hitungKeliling());
        System.out.println("Luas : " + circle.hitungLuas());

        s.close();
    }
}
