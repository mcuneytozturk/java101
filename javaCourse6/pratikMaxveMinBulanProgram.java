package javaCourse6;

import java.util.Arrays;
import java.util.Scanner;

public class pratikMaxveMinBulanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = { 1, 6, 7, 4, 5, -1, -12, 100, 10 };

        //int değişkenine verilebilecek en küçük ve en büyük sayılar girilir
        int min = -2147483647;
        int max = 2147482647;

        //dizi ekrana yazdırılır
        System.out.println("Dizi :" + Arrays.toString(nums));

        //sayı alınır
        
        System.out.print("Girilen sayı: ");
        int num = scanner.nextInt();
        Arrays.sort(nums);


        //EN yakın küçük sayı
        for (int i : nums) {
            //eğer girilen sayı dizide sıradaki sayıdan büyük ise min değeri değiştirilir son değişiklik en yakın küçük sayı olacaktır
            if (num > i) {
                min = i;
            }
        }

        //EN yakın büyük sayı
        for(int i : nums){
            //eğer girilen sayı dizide sıradaki sayıdan küçük ise max değeri değiştirilir ve ilk değişiklik en yakın büyük sayı olacağından forEach döngüsü durdurulur
            if(i > num){
                max = i;
                break;
            }
        }

        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
    }
}