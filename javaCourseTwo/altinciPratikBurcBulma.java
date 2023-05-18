package javaCourseTwo;

import java.util.Scanner;

public class altinciPratikBurcBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ay'ı(sayı olarak) giriniz: ");
        int ay = input.nextInt();
        System.out.print("Doğduğunuz günü giriniz: ");
        int gün = input.nextInt();

        if(ay == 1){
            if (gün <= 21){
                System.out.println("Burcunuz: Oğlak");
            } else {
            System.out.println("Burcunuz: Kova");
            }
        } else if(ay == 2){
            if (gün <= 19){
                System.out.println("Burcunuz: Kova");
            } else {
            System.out.println("Burcunuz: Balık");
            }
        } else if(ay == 3){
            if (gün <= 20){
                System.out.println("Burcunuz: Balık");
            } else {
            System.out.println("Burcunuz: Koç");
            }
        } else if(ay == 4){
            if (gün <= 21){
                System.out.println("Burcunuz: Koç");
            } else {
            System.out.println("Burcunuz: Boğa");
            }
        } else if(ay == 5){
            if (gün <= 19){
                System.out.println("Burcunuz: Boğa");
            } else {
            System.out.println("Burcunuz: İkizler");
            }
        } else if(ay == 6){
            if (gün <= 22){
                System.out.println("Burcunuz: İkizler");
            } else {
            System.out.println("Burcunuz: Yengeç");
            }
        } else if(ay == 7){
            if (gün <= 22){
                System.out.println("Burcunuz: Yengeç");
            } else {
            System.out.println("Burcunuz: Aslan");
            }
        } else if(ay == 8){
            if (gün <= 22){
                System.out.println("Burcunuz: Aslan");
            } else {
            System.out.println("Burcunuz: Başak");
            }
        } else if(ay == 9){
            if (gün <= 22){
                System.out.println("Burcunuz: Başak");
            } else {
            System.out.println("Burcunuz: Terazi");
            }
        } else if(ay == 10){
            if (gün <= 22){
                System.out.println("Burcunuz: Terazi");
            } else {
            System.out.println("Burcunuz: Akrep");
            }
        } else if(ay == 11){
            if (gün <= 21){
                System.out.println("Burcunuz: Akrep");
            } else {
            System.out.println("Burcunuz: Yay");
            }
        } else if(ay == 12){
            if (gün <= 21){
                System.out.println("Burcunuz: Yay");
            } else {
            System.out.println("Burcunuz: Oğlak");
            }
        } 

    }
}
