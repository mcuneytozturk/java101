package javaCourseTwo;
import java.util.Scanner;
public class odevUcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mesafe, yas, yolculukTipi;

        System.out.print("Mesafe'yi mesafe türünden giriniz : ");
        
        mesafe = input.nextDouble();
        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextDouble();
        System.out.print("Yolculuk tipinizi giriniz(1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTipi = input.nextDouble();

        double normalTutar = mesafe * 0.10, yasIndirimi = 0.00, indirimliTutar;
        
        if(yas > 65) {
            yasIndirimi = 0.30;      
        } else if (yas < 12) {
            yasIndirimi = 0.50;
        } else if (yas < 24) {
            yasIndirimi = 0.10;
        } else if (yas < 0) {
            System.out.println("Hatalı Veri Girdiniz, yaş eksi  değer alamaz!");
        } 

        indirimliTutar = normalTutar - (normalTutar * yasIndirimi);
        
        if (yolculukTipi == 1){
            //yolculuk tipi tek yön ise indirimli tutar son ücret olarak yansıtılır.
            System.out.println("Toplam Ücret = " + indirimliTutar);
        } else if ( yolculukTipi == 2) {
            //yolculuk tipi gidiş dönüş ise ücretin %80'i alınacaktır(kod kalabalıklaşmasın diye %100 - %20 yapıldı)
            indirimliTutar = indirimliTutar * 0.80 * 2;
            System.out.println("Toplam Ücret = " + indirimliTutar);
        } else {
            System.out.println("Hatalı veri girdiniz, yolculuk tek yön yada gidiş dönüş olmalıdır.");
        }




    }
}
