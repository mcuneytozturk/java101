package javaCourse3;

import java.util.Scanner;

public class odevTersUcgenYapimi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        int basamak = scanner.nextInt();

        for (int i = basamak; i >= 1; i--) {
            for (int j = (basamak - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = ((2 * i) - 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
}
}