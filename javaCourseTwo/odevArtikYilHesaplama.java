package javaCourseTwo;

import java.util.Scanner;

/**
 * odevArtikYilHesaplama
 */
public class odevArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Artık Yıl hesaplamak için;");
        System.out.print("Öğrenmek istediğiniz yılı girin: ");

        int yil = scanner.nextInt();

        if(yil % 4 == 0){
            if(yil % 100 != 0 || yil % 400 == 0){
                System.out.println(yil + " bir artık yıldır.");
            }
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }

}