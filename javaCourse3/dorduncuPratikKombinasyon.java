package javaCourse3;

import java.util.Scanner;

public class dorduncuPratikKombinasyon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("N elemanlı bir kümeden r elemanlı kaç küme oluşturulabilir?");
        System.out.print("N = ");
        int nEleman = scanner.nextInt();
        System.out.print("R = ");
        int rEleman = scanner.nextInt();
        
        int nFakt = 1;
        int rFakt = 1;
        int nEksiRFakt =1;
        
        for (int i = 1; i <= nEleman; i++){
            nFakt = nFakt * i;
        }
        int j = 1;
        
        while(j <= rEleman){
            rFakt = rFakt * j;
            j++;
        }

        int nEksiR = (nEleman - rEleman);
        int z = 1;

        do {
            nEksiRFakt = nEksiRFakt * z;
            z++;
        } while (z <= nEksiR);
        
        int kombinasyon = nFakt / (rFakt * nEksiRFakt);

        System.out.println("C(" + nEleman + "," + rEleman + ") = " + kombinasyon);
        
    }
}
