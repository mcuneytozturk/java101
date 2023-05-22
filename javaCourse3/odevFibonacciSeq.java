package javaCourse3;

import java.util.Scanner;

public class odevFibonacciSeq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fibonacci serisinin kaç basamağını görmek istediğinizi giriniz: ");

        int basamak = scanner.nextInt(), ilkBasamak = 0, ikinciBasamak = 1;

        System.out.print(ilkBasamak + " " + ikinciBasamak + " ");

        for(int i = 2; i < basamak; i++){
            int sıradakiBasamak = ilkBasamak + ikinciBasamak;

            System.out.print(sıradakiBasamak + " ");

            ilkBasamak = ikinciBasamak;
            ikinciBasamak = sıradakiBasamak;
        }
    }
}
