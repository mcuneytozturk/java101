package javaCourse1;

import java.util.Scanner;

public class ilkPratikOrtalamaPuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fizik, kimya, tarih, matematik, turkçe, muzik;

        System.out.println("Fizik notunu gir: ");
        fizik = input.nextInt();
        System.out.println("Kimya notunu gir: ");
        kimya = input.nextInt();
        System.out.println("Tarih notunu gir: ");
        tarih = input.nextInt();
        System.out.println("Matematik notunu gir: ");
        matematik = input.nextInt();
        System.out.println("Türkçe notunu gir: ");
        turkçe = input.nextInt();
        System.out.println("Müzik notunu gir: ");
        muzik = input.nextInt();
        
        int toplam = fizik + kimya + tarih + matematik + turkçe + muzik;
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız :" + sonuc);
        System.out.println(sonuc < 60 ? "Ne yazık ki kalmışsın :(" : "Aferin sana geçmişsin!!");

    }
}