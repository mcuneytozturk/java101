package javaCourse3;

import java.util.Scanner;

public class yedinciPratikHarmonikSayilar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Harmonik sayısını bulmak istediğiniz sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        double harmonika = 0;

        for (int i = 1; i <= sayi; i++){
            harmonika += (1.0 / i);
        }
        System.out.println("Girdiğiiz sayının harmonik ortalaması = " + harmonika);

    }
}
