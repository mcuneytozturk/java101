package javaCourse6;

import java.util.Arrays;
import java.util.Scanner;

public class pratikTekrarEdenCiftSayilar {

    static boolean isFind(int[] arr, int value){
        for(int i : arr){
            if(i == value){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        //kullanıcıdan bir dizi oluşturması istenir.

        System.out.print("Dizinin boyutu n : ");
        int n = Scanner.nextInt();

        int[] arr = new int[n];
        int temp = 1;

        while (temp < n + 1){
            System.out.println(temp + ". Elemanı : ");
            arr[temp - 1] = Scanner.nextInt();
            temp++;
        }

        System.out.println(Arrays.toString(arr));

        
        int[] duplicate = new int[arr.length];
        int startIndex = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i != j && arr[i] == arr[j] && arr[i] % 2 == 0){
                    if(!isFind(duplicate, arr[i])){
                        duplicate[startIndex++] = arr[i];
                        break;
                    }
                }
            }
        }
        for(int value : duplicate){
            if(value != 0){
                System.out.println(value);
            }
        }
    }
}
