package javaCourse3;

import java.util.Scanner;

public class odevMukemmelSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //sayı istenşr
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        int total  = 0;


        //girilen sayıya kadar olan sayıların kalansız bölenleri total değerine eklenir
        for(int i = 1; i < number; i++ ){
            if(number != 1 && number % i == 0){
                total += i;
            }
        }
        //eğer total değişkeninin son değeri girilen sayıya eşitse mükemmel sayıdır.

        if(total == number){
            System.out.println(number + " mükemmel sayıdır");
        } else {
            System.out.println(number + " mükemmel sayı değildir");
        }
    }
}
