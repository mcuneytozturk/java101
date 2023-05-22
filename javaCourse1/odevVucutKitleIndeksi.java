package javaCourse1;

/**
 * odevVucutKitleIndeksi
 */

import java.util.Scanner;
public class odevVucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);


        //değişkenler tanımlanır
        double height, weight;

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        
        height = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        
        weight = inp.nextDouble();

        //vki = vücutKiloEndeksi hesaplanır ve yazdırılır

        double vki = weight / (height * height);

        System.out.println("Vücut Kitle İndeksiniz : " + vki + " " + "kg/m2");
    }
    
}