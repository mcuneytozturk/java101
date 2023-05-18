package javaCourse1;

import java.util.Scanner;

public class ikinciPratikKdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fiyat;
        System.out.print("KDV dahil fiyatını öğrenmek istediğiniz ürünün fiyatını girin : ");

        fiyat = input.nextDouble();
        
        double kdv = fiyat < 1000 ? 0.18 : 0.08;

        double kdvTutar = fiyat + (fiyat * kdv);

        System.out.println("Almak istediğiniz ürünün fiyatı :" + fiyat + " tl");
        System.out.println("Ürün fiyatına göre kdv:" + kdv);
        System.out.println("Ürünün kdv dahil fiyatı :" + kdvTutar + " tl");
    }
}