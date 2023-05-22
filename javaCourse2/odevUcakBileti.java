package javaCourse2;
import java.util.Scanner;
public class odevUcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //ana değişkenler tanımlanır ve değerleri istenir
        double distance, age, travelType;

        System.out.print("Mesafe'yi mesafe türünden giriniz : ");
        distance = input.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        age = input.nextDouble();

        System.out.print("Yolculuk tipinizi giriniz(1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        travelType = input.nextDouble();

        //tutar değişkenleri tanımlanır ve hesaplanır
        double normalWage = distance * 0.10, discount = 0.00, discountWage;
        
        //yaşa bağlı hesaplamalar if ile yapılır
        if(age > 65) {
            discount = 0.30;      
        } else if (age < 12) {
            discount = 0.50;
        } else if (age < 24) {
            discount = 0.10;
        } else if (age < 0) {
            System.out.println("Hatalı Veri Girdiniz, yaş eksi  değer alamaz!");
        } 

        //indirimli tutar hesaplanır
        discountWage = normalWage - (normalWage * discount);
        
        //son fiyat hesabı yapılır
        if (travelType == 1){
            //yolculuk tipi tek yön ise indirimli tutar son ücret olarak yansıtılır.
            System.out.println("Toplam Ücret = " + discountWage);
        } else if ( travelType == 2) {
            //yolculuk tipi gidiş dönüş ise ücretin %80'i alınacaktır(kod kalabalıklaşmasın diye %100 - %20 yapıldı)
            discountWage = discountWage * 0.80 * 2;
            System.out.println("Toplam Ücret = " + discountWage);
        } else {
            System.out.println("Hatalı veri girdiniz, yolculuk tek yön yada gidiş dönüş olmalıdır.");
        }




    }
}
