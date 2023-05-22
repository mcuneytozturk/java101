package javaCourse4;

import java.util.Scanner;

public class ikinciPratikRecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonaccide görmek istediğiniz basamak sayısını yazınız: ");
        int n = scanner.nextInt(); // Change this to the desired number of terms

        System.out.println("Fibonacci sequence up to " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
