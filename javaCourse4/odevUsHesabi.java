package javaCourse4;

import java.util.Scanner;

public class odevUsHesabi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Taban değeri giriniz: ");
        int num = scanner.nextInt();

        System.out.println("Üs değerini giriniz: ");
        int pow = scanner.nextInt();

        System.out.println("Sonuç: " + expo(num, pow));
    };

    static int expo(int a, int b){
        
        if(b == 0){
            return 1;
        } else{
            return a * expo(a, b-1); 
        }
        
    }
}
