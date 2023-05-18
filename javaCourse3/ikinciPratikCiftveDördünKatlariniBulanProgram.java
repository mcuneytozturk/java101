package javaCourse3;

import java.util.Scanner;

/**
 * ikinciPratikTekSayilarToplami
 */
public class ikinciPratikCiftveDördünKatlariniBulanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Girdiğiniz sayıya kadar olan 3 ve 4'ün katı olan sayıların ortalaması için;");
        System.out.print("Bir sayı giriniz: ");

        int sayi = scanner.nextInt();

        while(sayi % 2 == 0) {
            System.out.println("Lütfen tek sayı giriniz.");
            sayi = scanner.nextInt();
        }
        int toplam = 0;
        int bölen = 0;

        //ödev kısmı
            for (int i = 0; i <= sayi; i++) {
                if (i % 2 == 0 && i % 4 == 0) {
                    toplam += i;
                    bölen++;
                }
            }
        int ortalama = toplam / bölen;
        System.out.println("Çift olan ve 4'e bölünebilen sayıların ortalaması: " + ortalama);
    }
}