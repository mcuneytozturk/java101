package javaCourseOne;

import java.util.Scanner;
/**
 * besinciPratikDaireninAlani
 */
public class besinciPratikDaireninAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yariCap, alfa;
        double pi = 3.14;

        System.out.print("Daire'nin yarıçapını giriniz : ");
        yariCap = input.nextInt();

        System.out.print("Daire diliminin merkez açısının ölçüsü : ");

        alfa = input.nextInt();

        double alan = (yariCap * yariCap * pi * alfa) / 360;
        double cevre = 2 * yariCap * pi;

        System.out.println("berilen değerlere göre dairenizin alanı: " + alan);
        System.out.println("berilen değerlere göre dairenizin çevresi : " + cevre);
        
    }
}