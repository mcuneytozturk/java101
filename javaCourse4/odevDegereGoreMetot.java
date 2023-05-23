package javaCourse4;

import java.util.Scanner;

public class odevDegereGoreMetot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N sayısı: ");
        int n = scanner.nextInt();
        System.out.print("Çıktısı: ");
        manipulateNumber(n);
    }
    
    public static void manipulateNumber(int n) {
        System.out.print(n + " ");

        if (n <= 0) {
            return;
        }

        manipulateNumber(n - 5);
        System.out.print(n + " ");
    }
}
