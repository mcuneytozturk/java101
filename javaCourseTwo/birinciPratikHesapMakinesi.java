package javaCourseTwo;

import java.util.Scanner;

public class birinciPratikHesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n1, n2, select, sonuc;

        System.out.print("ilk sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.print("ikinci sayıyı giriniz: ");
        n2 = input.nextInt();
        
        System.out.println("1: Toplama \n 2: Çıkarma \n 3: Çarpma \n 4: Bölme ");
        System.out.print("Seçiminiz: ");

        select = input.nextInt();

        switch(select){
            case 1:
                sonuc = n1 + n2;
                System.out.print("İşlemin sonucu: " + sonuc);
                break;
                case 2:
                sonuc = n1 - n2;
                System.out.print("İşlemin sonucu: " + sonuc);
                break;
                case 3:
                sonuc = n1 * n2;
                System.out.print("İşlemin sonucu: " + sonuc);
                break;
                case 4:
                sonuc = n1 / n2;
                System.out.print("İşlemin sonucu: " + sonuc);
                break;
            default:
                System.out.println("İşlem için sıralamadaki bir sayıyı belirtmeniz gerekmektedir.");
                break;

        }

    }
}

