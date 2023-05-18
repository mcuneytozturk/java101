package javaCourse3;

import java.util.Scanner;

public class onuncuPratikObebOkek {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("ilk sayınızı giriniz: ");
    int sayi1 = scanner.nextInt();
    System.out.print("İkinci sayınızı giriniz: ");
    int sayi2 = scanner.nextInt();

    int obeb = 1, okek;

    int i = 1;
    while(i <= sayi1 && i <= sayi2){
        if(sayi1 % i == 0 && sayi2 % i == 0){
            obeb = i;
        } 
        
        i++;
    }
    
    okek = (sayi1 * sayi2) / obeb;
    
    System.out.println("Obeb: " + obeb );
    System.out.println("Okek:" + okek);
   } 
}
