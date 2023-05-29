package javaCourse7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class pratikSayiTahminOyunu {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        System.out.println(number);

        Scanner scanner = new Scanner(System.in);
        int selected = 0;
        int right = 0;
        boolean isWin = false;

        while(right < 5){
            System.out.print("Tahmininizi giriniz: ");
            selected = scanner.nextInt();
            if(selected < 0 || selected > 100){
                System.out.println("Lütfen 0 ile 100 arasında bir sayı deneyiniz");
                continue;
            } 
            if(selected == number){
                System.out.println("Doğru tahmin!!");
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı sayı girdiniz");
                if(selected < number){
                    System.out.println("Tahmininiz sayıdan küçüktür");
                } else if(selected > number){
                    System.out.println("Tahmininiz sayıdan büyüktür.");
                }
            }
            System.out.println("Kalan hakkınız : " + (5 - right));
            right++;
        }

        if(!isWin){
            System.out.println("Hakkınız bitti, Kaybettiniz");
        } else{
            System.out.println("Tebrikler kazandınız");
            System.out.println("Sayı : " + number + "Tahmininiz : " + selected);
        }
    }
}
 