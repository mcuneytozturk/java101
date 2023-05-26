package javaCourse6.odevDizidekiElemanlariSiralama.src;

import java.util.Scanner;
import java.util.Arrays;

public class odevDizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        int n = Scanner.nextInt();

        int[] dizi = new int[n];
        int temp = 1;

        while (temp < n + 1){
            System.out.println(temp + ". Elemanı : ");
            dizi[temp - 1] = Scanner.nextInt();
            temp++;
        }

        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));

    }
    
}
