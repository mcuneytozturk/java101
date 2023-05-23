package javaCourse4;

import java.util.Scanner;

public class odevDegereGoreMetot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //N sayısı alınır

        System.out.print("N sayısı: ");
        int n = scanner.nextInt();
        System.out.print("Çıktısı: ");
        manipulateNumber(n);
    }

    public static void manipulateNumber(int n) {
        //N sayısı "Çıktısı : " yanına yazdırılır
        
        // sayısı 0'dan küçük ise döndürülür 
        if (n <= 0) {
            System.out.print(n + " ");   
            return;
        }
        
        System.out.print(n + " ");   
        //özyineleme ile N sayısından 5 eksiltilir
        manipulateNumber(n - 5);

        //n sayısı yazdırılır
        System.out.print(n + " ");
    }
}