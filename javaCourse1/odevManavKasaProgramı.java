package javaCourse1;

import java.util.Scanner;

public class odevManavKasaProgramı {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double armut, elma, domates, muz, patlıcan, toplam;

        System.out.print("Armut aldıysanız kaç kilo aldığınızı almadıysanız 0 giriniz : ");

        armut = inp.nextDouble();

        System.out.print("Elma aldıysanız kaç kilo aldığınızı almadıysanız 0 giriniz : ");

        elma = inp.nextDouble();

        System.out.print("Domates aldıysanız kaç kilo aldığınızı almadıysanız 0 giriniz : ");

        domates = inp.nextDouble();

        System.out.print("Muz aldıysanız kaç kilo aldığınızı almadıysanız 0 giriniz : ");

        muz = inp.nextDouble();

        System.out.print("Patlıcan aldıysanız kaç kilo aldığınızı almadıysanız 0 giriniz : ");

        patlıcan = inp.nextDouble();

        toplam = armut * 2.14 + elma * 3.67 + domates * 1.11 + muz * 0.95 + patlıcan * 5.00;

        System.out.print("Aldıklarınızın toplamı : " + toplam + " tl tutmaktadır");
    }
}
