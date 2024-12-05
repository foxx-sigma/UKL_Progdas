package ukl_mudah;

import java.util.Scanner;

public class Ukl_mudah {

    public static void main(String[] args) {
        System.out.println("Program Diskon");
        System.out.println("--------------");
        double harga;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Harga : ");
        harga = input.nextDouble();
        System.out.println("Apakah anda member? (ya/tidak) ");
        String jawab = input.next(); 
        System.out.println("Yang harus anda bayar adalah Rp " + hitungDiskon(harga, jawab));
    }

    public static double hitungDiskon(double harga, String jawab) {
        double diskon;

        
        if (harga < 100000) {
            System.out.println("Anda tidak dapat diskon");
            return harga;
        } 
        
        
        if (jawab.contains("ya")) {
            if (harga <= 200000) {
                diskon = 10;
                System.out.println("Anda mendapat diskon 10%");
                double diskon1 = harga * (diskon / 100);
                double hasil1 = harga - diskon1 ;
                return hasil1;
                
            } else {
                diskon = 20;
                System.out.println("Anda mendapat diskon 20%");
                double diskon2 = harga * (diskon / 100);
                double hasil2 = harga - diskon2 ;
                return hasil2;
            }
        } else {
            System.out.println("Anda bukan member, tidak ada diskon.");
            return harga;
        }
    }
}