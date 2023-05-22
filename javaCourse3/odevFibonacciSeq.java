package javaCourse3;

import java.util.Scanner;

public class odevFibonacciSeq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Basamak sayısı alınır

        System.out.println("Fibonacci serisinin kaç basamağını görmek istediğinizi giriniz: ");

        int digit = scanner.nextInt(), firstDigit = 0, secondDigit = 1;

        //ilk iki digit 0 ve 1 olacağından onlar önce belirlenir ve yazdırılır
        System.out.print(firstDigit + " " + secondDigit + " ");

        for(int i = 2; i < digit; i++){

            //bir sonraki digit toplanır
            int nextDigit = firstDigit + secondDigit;

            System.out.print(nextDigit + " ");

            //toplama sonrası toplanacak basamaklar değiştirilir
            firstDigit = secondDigit;
            secondDigit = nextDigit;
        }
    }
}
