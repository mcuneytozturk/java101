package javaCourseOne;

/**
 * odevVucutKitleIndeksi
 */

import java.util.Scanner;
public class odevVucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double boy, kilo;

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        
        boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        
        kilo = inp.nextDouble();

        double vki = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + vki + " " + "kg/m2");
    }
    
}