package javaCourse3;

import java.util.Scanner;

public class ucuncuPratik4v5inKuvvetliri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Girdiğiniz sayıya kadar olan 4 ve 5'in kuvvetleri için;");
        System.out.print("Bir sayı giriniz: ");

        int sayi = scanner.nextInt();

        System.out.println("Dördün kuvvetleri; ");
        for (int i=1; i < sayi; i *= 4) {
            System.out.println(i);
        }

        System.out.println("Beşin kuvvetleri = ");
        for (int j=1; j < sayi; j *= 5) {
            System.out.println(j);
        }

    }
}
