package javaCourse1;

import java.util.Scanner;

public class dorduncuPratikTaksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double wpkm = 2.20, baseWage = 10;

        System.out.println("Gidilen Mesafeyi Giriniz: ");

        double km = input.nextDouble();

        double wage = baseWage + km * wpkm;

        double realWage = wage < 20 ? 20 : wage;

        System.out.println("ödemeniz gereken tutar: " + (realWage <= 20 ? "Minimum tutar olan 20tl'dir": realWage + "tl"));

    }
}
