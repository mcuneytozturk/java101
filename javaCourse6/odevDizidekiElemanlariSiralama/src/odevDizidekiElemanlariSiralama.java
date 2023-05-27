package javaCourse6.odevDizidekiElemanlariSiralama.src;

import java.util.Scanner;
import java.util.Arrays;

public class odevDizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        //kullanıcıdan dizi oluşturması istenir.

        System.out.print("Dizinin boyutu n : ");
        int n = Scanner.nextInt();

        int[] dizi = new int[n];
        int temp = 1;

        //dizinin elemanları tek tek alınır.

        while (temp <= n){
            System.out.println(temp + ". Elemanı : ");
            dizi[temp - 1] = Scanner.nextInt();
            temp++;
        }

        //dizi sıralanır.

        Arrays.sort(dizi);

        //dizi yazdırılır.
        System.out.println(Arrays.toString(dizi));

    }
    
}
