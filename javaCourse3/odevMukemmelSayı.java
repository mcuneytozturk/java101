package javaCourse3;

import java.util.Scanner;

public class odevMukemmelSayı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int toplam  = 0;

        for(int i = 1; i < sayi; i++ ){
            if(sayi != 1 && sayi % i == 0){
                toplam += i;
            }
        }

        if(toplam == sayi){
            System.out.println(sayi + " mükemmel sayıdır");
        } else {
            System.out.println(sayi + " mükemmel sayı değildir");
        }
    }
}
