package javaCourse4;

import java.util.Scanner;

public class odevUsHesabi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //değerler istenir

        System.out.println("Taban değeri giriniz: ");
        int num = scanner.nextInt();

        System.out.println("Üs değerini giriniz: ");
        int pow = scanner.nextInt();

        //sonuç yanında exponential yani üs alma fonksiyonu çağrılarak yazdırılır 2^3 için "Sonuç: 8" gibi bir çıktı alınır
        System.out.println("Sonuç: " + expo(num, pow));
    };

    static int expo(int a, int b){
        //üs değeri 0 ise sonuç 1 olacaktır
        if(b == 0){
            return 1;
            //değilse taban değer kendisi ile çarpılır ve üs bir azaltılarak fonksiyon yeniden çağrılır
        } else{
            return a * expo(a, b-1); 
        }
        
    }
}
