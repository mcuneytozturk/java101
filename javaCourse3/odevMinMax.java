package javaCourse3;

import java.util.Scanner;

public class odevMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz = ");
        int miktar = scanner.nextInt();

        int i = 1;

        int min = 21470000;
        int max = -21470000;

        while(i <= miktar){
            System.out.print(i + ". Sayıyı giriniz: ");
            int number = scanner.nextInt();
            if(number < min){
                min = number;
            } else if (number > max){
                max = number;
            }
            i++;
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

    }
}
