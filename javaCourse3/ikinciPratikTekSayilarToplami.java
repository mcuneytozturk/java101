package javaCourse3;

import java.util.Scanner;

/**
 * ikinciPratikTekSayilarToplami
 */
public class ikinciPratikTekSayilarToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Girdiğiniz sayıya kadar olan çift sayılar için;");
        System.out.print("Bir sayı giriniz: ");

        int sayi = scanner.nextInt();

        int toplam = 0;

        for (int i = 0; i < sayi; i++) {
            if(i % 2 == 1){
                toplam += i;
            } else {
                continue;
            }
            
        }

    }
}