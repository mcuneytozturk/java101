package javaCourse2;

import java.util.Scanner;

/**
 * odevArtikYilHesaplama
 */
public class odevArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //aranan yıl alınır
        System.out.println("Artık Yıl hesaplamak için;");
        System.out.print("Öğrenmek istediğiniz yılı girin: ");

        int year = scanner.nextInt();

        //eğer yıl 4'e kalansız bölünüyorsa artık yıldır
        if(year % 4 == 0){
            if(year % 100 != 0 || year % 400 == 0){
                System.out.println(year + " bir artık yıldır.");
            }
        } else {
            System.out.println(year + " bir artık yıl değildir.");
        }
    }

}