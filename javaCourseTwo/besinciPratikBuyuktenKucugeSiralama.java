package javaCourseTwo;

import java.util.Scanner;

public class besinciPratikBuyuktenKucugeSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı girin: ");
        int n1 = input.nextInt();

        System.out.print("2. sayıyı girin: ");
        int n2 = input.nextInt();

        System.out.print("3. sayıyı girin: ");
        int n3 = input.nextInt();

        if (n1 <= n2 && n1 <= n3) {
            if (n2 <= n3) {
                System.out.println("Sıralama: " + n1 + " " + n2 + " " + n3);
            } else {
                System.out.println("Sıralama: " + n1 + " " + n3 + " " + n2);
            }
        } else if (n2 <= n1 && n2 <= n3) {
            if (n1 <= n3) {
                System.out.println("Sıralama: " + n2 + " " + n1 + " " + n3);
            } else {
                System.out.println("Sıralama: " + n2 + " " + n3 + " " + n1);
            }
        } else {
            if (n1 <= n2) {
                System.out.println("Sıralama: " + n3 + " " + n1 + " " + n2);
            } else {
                System.out.println("Sıralama: " + n3 + " " + n2 + " " + n1);
            }
        }
    }
}
