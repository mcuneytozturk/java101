package javaCourse3;

import java.util.Scanner;

public class odevAsalSayiBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 ile 100 arasında ki asal sayılar :");
        for(int sayi = 2; sayi < 100; sayi++){
            boolean asalMi = true;

            for(int i = 2; i < sayi; i++){
                if(sayi % i == 0){
                    asalMi = false;
                    break;
                }
            }

            if(asalMi){
                System.out.print(sayi + " ");
            }
        }



    }
}
