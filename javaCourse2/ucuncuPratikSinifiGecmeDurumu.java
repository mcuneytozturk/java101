package javaCourse2;

import java.util.Scanner;

public class ucuncuPratikSinifiGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fizik, kimya, matematik, turkce, muzik;

        System.out.print("Fizik notunu gir: ");
        fizik = input.nextInt();
        System.out.print("Kimya notunu gir: ");
        kimya = input.nextInt();
        System.out.print("Matematik notunu gir: ");
        matematik = input.nextInt();
        System.out.print("Türkçe notunu gir: ");
        turkce = input.nextInt();
        System.out.print("Müzik notunu gir: ");
        muzik = input.nextInt();

        if((fizik < 100 && fizik > 0) && (kimya < 100 && kimya > 0) && (matematik < 100 && matematik > 0) && (turkce < 100 && turkce > 0) && (muzik < 100 && muzik > 0)){
            int toplam = fizik + kimya + matematik + turkce + muzik;
            double sonuc = toplam / 6.0;
            System.out.println("Ortalaman :" + sonuc);
            if(sonuc < 55){
                System.out.println("Aferin sana geçmişsin!!");
            } else {
                System.out.println("Ne yazık ki kalmışsın. Daha çok çalış!!");
    
            }
        } else {
            System.out.println("Tüm notların 0 ve 100 arasında değer alması gerekmektedir.");
            System.out.println("fizik: " + fizik);
            System.out.println("kimya: " + kimya);
            System.out.println("matematik: " + matematik);
            System.out.println("muzik: " + muzik);
            System.out.println("turkce: " + turkce);
        }


    }
}
