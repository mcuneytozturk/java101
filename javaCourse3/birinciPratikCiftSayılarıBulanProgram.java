package javaCourse3;

import java.util.Scanner;

/**
 * birinciPratikCiftSayılarıBulanProgram
 */
public class birinciPratikCiftSayılarıBulanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Girdiğiniz sayıya kadar olan çift sayılar için;");
        System.out.print("Bir sayı giriniz: ");

        int sayi = scanner.nextInt();

        for (int i = 0; i < sayi; i++) {
            if(i % 2 == 0){
                System.out.println(i + " ");
            } else {
                continue;
            }
            
        }

    }
}