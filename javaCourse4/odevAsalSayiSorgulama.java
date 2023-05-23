package javaCourse4;

import java.util.Scanner;

public class odevAsalSayiSorgulama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Sayı istenir
        System.out.print("Sayı giriniz: ");
        int num = scanner.nextInt();

        if(isPrime(num, 2)){
            System.out.println(num + " sayısı ASALDIR");
        } else {
            System.out.println(num + " sayısı ASAL değildir");
        }
    }

    static boolean isPrime(int a, int b){
    if (a == b) {
        return true;
    } else if (a % b == 0) {
        return false;
    } else {
        return isPrime(a, ++b);
    }
}
}
