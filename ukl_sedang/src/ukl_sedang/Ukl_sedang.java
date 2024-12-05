package ukl_sedang;

import java.util.Scanner;

public class Ukl_sedang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menghitung Luas Permukaan Bola");
        System.out.println("-------------------------------------");
        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();
        double hasil = hitungLuasPermukaanBola(r);
        
        System.out.println("Hasil perhitungan Luas Permukaan Bola adalah: " + hasil);
        System.out.println("Mengitung Luas Lingkaran : ");
        System.out.println("Masukkan jari jari : ");
        double r1 = input.nextDouble();
        System.out.println("Hasil perhitungan Luas Permukaan Bola adalah: " + hasil);
        double hasil1 = hitungLuasLingkaran(r1);
    }

    public static double hitungLuasPermukaanBola(double r) {
        double phi = 3.14; 
        double hasil = 4 * phi * (r * r); 
        return hasil; 
    }
    public static double hitungLuasLingkaran(double r1){
        double phi = 3.14;
        double hasil1 = phi * r1 * r1 ;
        return hasil1;
    }
}