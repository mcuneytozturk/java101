package javaCourse1;

import java.util.Scanner;

public class odevManavKasaProgramı {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // değişkenler tanımlanır
        double pear, apple, tomato, banana, eggPlant, total;

        // her bir kalem'in kg'ı sorulur

        System.out.print("Armut aldıysanız kaç kilo aldığınızı almadıysanız 0 giriniz : ");

        pear = inp.nextDouble();

        System.out.print("Elma aldıysanız kaç kilo aldığınızı almadıysanız 0 giriniz : ");

        apple = inp.nextDouble();

        System.out.print("Domates aldıysanız kaç kilo aldığınızı almadıysanız 0 giriniz : ");

        tomato = inp.nextDouble();

        System.out.print("Muz aldıysanız kaç kilo aldığınızı almadıysanız 0 giriniz : ");

        banana = inp.nextDouble();

        System.out.print("Patlıcan aldıysanız kaç kilo aldığınızı almadıysanız 0 giriniz : ");

        eggPlant = inp.nextDouble();

        //her bir kalemin toplaması yapılır ve çıktı alınır

        total = pear * 2.14 + apple * 3.67 + tomato * 1.11 + banana * 0.95 + eggPlant * 5.00;

        System.out.print("Aldıklarınızın toplamı : " + total + " tl tutmaktadır");
    }
}
