package javaCourse3;

import java.util.Scanner;

public class besinciPratikUsluSayıHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üssünün hesaplanacağı sayıyı giriniz;");
        int sayi = scanner.nextInt();

        System.out.print("Üs değeri giriniz;");
        int us = scanner.nextInt();

        int total = 1;

        for(int i = 0; i < us; i++ ){
            total *= sayi;
        }

        System.out.println(sayi + "^" + us + " = " + total);
    }
}
