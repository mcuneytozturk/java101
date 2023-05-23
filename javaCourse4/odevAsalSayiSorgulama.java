package javaCourse4;

import java.util.Scanner;

public class odevAsalSayiSorgulama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Sayı istenir
        System.out.print("Sayı giriniz: ");
        int num = scanner.nextInt();

        //burda asal sayı ise true değilse false döndürecek fonksiyon çağrılır ve eğer bildirisinin içine koyulur sonuç yazdırılır
        if(isPrime(num, 2)){
            System.out.println(num + " sayısı ASALDIR");
        } else {
            System.out.println(num + " sayısı ASAL değildir");
        }
    }

    //asal mı? fonksiyonu yazılır a girilen sayı b bölen olmak üzere iki değer verilir

    static boolean isPrime(int a, int b){
        //değer bölene eşit ise çağırma bitmiş demektir
    if (a == b) {
        return true;
        //değer bölene eşitlenmeden tam bölünüyorsa çağırma biter false döner
    } else if (a % b == 0) {
        return false;
    } else {
        //iki koşulda sağlanmıyorsa bölen bir arttıralarak fonksiyon kendini yeniler(recursive)
        return isPrime(a, ++b);
    }
}
}
