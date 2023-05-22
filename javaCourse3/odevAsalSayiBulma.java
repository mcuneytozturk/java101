package javaCourse3;

import java.util.Scanner;

public class odevAsalSayiBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //sayı istiyoruz

        System.out.println("1 ile 100 arasında ki asal sayılar :");

        //asal sayıları for loop ilee yazdırıyoruz
        for(int number = 2; number < 100; number++){
            
            //asal olup olmadığının kontrolünü boolean bir değişken ile sağlarız
            boolean isPrime = true;

            for(int i = 2; i < number; i++){
                if(number % i == 0){

                    //değişkenin kalansız bölündüğü bir sayı var ise boolean false olacağından yazdırmıyoruz
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.print(number + " ");
            }
        }



    }
}
