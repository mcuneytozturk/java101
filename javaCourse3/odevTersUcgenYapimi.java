package javaCourse3;

import java.util.Scanner;

public class odevTersUcgenYapimi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //digit sayısı istenir.

        System.out.print("Basamak sayısını giriniz: ");
        int digit = scanner.nextInt();
        
        //girilen digit sayısına kadar yıldız koyulur ve sayı 2 2 azalarak o basamaklara boşluk koyulur
        for (int i = digit; i >= 1; i--) {
            for (int j = (digit - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = ((2 * i) - 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
}
}