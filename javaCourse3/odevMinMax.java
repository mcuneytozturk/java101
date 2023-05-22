package javaCourse3;

import java.util.Scanner;

public class odevMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //kullanıcının sıralamak istediği sayı miktarı alınır
        System.out.print("Kaç tane sayı gireceksiniz = ");
        int miktar = scanner.nextInt();

        int i = 1;

        //önceden javada int değişkenlerinin alabileceği max. ve min birimdeki sayıların + ve eksilisi min ve max değerlerine atanır.
        int min = 21470000;
        int max = -21470000;


        while(i <= miktar){
            System.out.print(i + ". Sayıyı giriniz: ");
            int number = scanner.nextInt();

            //eğer numara min değerinden büyükse min, max değerinden küçükse max değerinin yerini alır ve sıradaki sayı ile aynı işlem devam eder
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
