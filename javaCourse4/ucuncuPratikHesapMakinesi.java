package javaCourse4;

import java.util.Scanner;

public class ucuncuPratikHesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yapmak istediğiniz işlemi seçiniz: 1. Toplama işlemi \n 2. Çıkarma İşlemi \n 3. Bölme işlemi \n 4. Çarpma işlemi \n 5. Üs alma \n 6. Factoriyel hesaplama \n 7. Mod Alma \n 8. Dikdörtgen alanı ve çevresi bulma \n 0. Çıkış yap ");

        int ops = scanner.nextInt();

        switch(ops){
            case 1:
                System.out.print("lk sayı: ");
                int num1 = scanner.nextInt();
                System.out.print("Toplancak sayı: ");
                int num2 = scanner.nextInt();
                System.out.println(num1 + " + " + num2 + " = " + sum(num1, num2));
                break;
            case 2:
                System.out.print("İlk sayı: ");
                int num3 = scanner.nextInt();
                System.out.print("Çıkarılacak sayı: ");
                int num4 = scanner.nextInt();
                System.out.println(num3 + " - " + num4 + " = " + sub(num3, num4));
                break;
            case 3:
                System.out.print("İlk sayı: ");
                int num5 = scanner.nextInt();
                System.out.print("Bölen sayı: ");
                int num6 = scanner.nextInt();
                System.out.println(num5 + " / " + num6 + " = " + div(num5, num6));
                break;
            case 4:
                System.out.print("İlk sayı: ");
                int num7 = scanner.nextInt();
                System.out.print("Çarpan sayı: ");
                int num8 = scanner.nextInt();
                System.out.println(num7 + " x " + num8 + " = " + multi(num7, num8));
                break;
            case 5:
                System.out.print("İlk sayı: ");
                int num9 = scanner.nextInt();
                System.out.print("Üs: ");
                int num10 = scanner.nextInt();
                System.out.println(num9 + " ^ " + num10 + " = " + expo(num9, num10));
                break;
            case 6:
                System.out.print("İlk sayı: ");
                int num11 = scanner.nextInt();
                System.out.println(num11 + "!" + " = " + fact(num11));
                break;
            case 7:
                System.out.print("Sayı: ");
                int num12 = scanner.nextInt();
                System.out.print("Mod: ");
                int num13 = scanner.nextInt();
                System.out.println(num12 + " mod " + num13 + " = " + mode(num12, num13));
                break;
            case 8:
                System.out.print("İlk kenar: ");
                int num14 = scanner.nextInt();
                System.out.print("İkinci kenar: ");
                int num15 = scanner.nextInt();
                rectangleAreaCircum(num14, num15);
                break;
            case 0: 
                System.out.println("Çıkış Yapıldı");
                break;
            default:
                System.out.println("Yanlış değer girdiniz");    
        }
    }

    static int sum(int a, int b){
        return a + b;
    }
    static int sub (int a, int b){
        return a - b;
    }
    static int div(int a, int b){
        return a / b;
    }
    static int multi(int a, int b){
        return a * b;
    }
    static int expo(int a, int b){
        for(int i = 0; i < b; i++){
           a *= b;
        }
        return a;
    }
    static int fact(int a){
        int result = 1;
        if(a == 0){
            return 1;
        } else {
            for(int i = 0; i < a; i++){
                a--;
                result *= a;
            }
        }
        return result;
    }
    static int mode(int a, int b){
        return a % b;
    }
    static void rectangleAreaCircum(int a, int b){
        int area = a * b, circumference = (a + b) * 2;
        System.out.println("Dikdörtgenin alanı: " + area);
        System.out.println("Dikdörtgenin çevresi: " + circumference);
    }
}
