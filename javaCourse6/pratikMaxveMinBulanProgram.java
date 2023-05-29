package javaCourse6;

import java.util.Arrays;
import java.util.Scanner;

public class pratikMaxveMinBulanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = { 1, 6, 7, 4, 5, -1, -12, 100, 10 };

        int min = 0;
        int max = 0;

        System.out.println("Dizi :" + Arrays.toString(nums));
        
        System.out.print("Girilen sayı: ");
        int num = scanner.nextInt();
        Arrays.sort(nums);


        //EN yakın küçük sayı
        for (int i : nums) {
            if (num > i) {
                min = i;
            }
        }

        //EN yakın büyük sayı
        for(int i : nums){
            if(i > num){
                max = i;
                break;
            }
        }

        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
    }
}