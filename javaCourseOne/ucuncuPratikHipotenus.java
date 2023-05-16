package javaCourseOne;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

import java.lang.Math;


public class ucuncuPratikHipotenus {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double kisaKenar, kisaKenarIki, hipotenus, alan;

        System.out.print("Dik üçgenin kısa kenar uzunluğu : ");
        
        kisaKenar = inp.nextInt();
        
        System.out.print("Dik üçgenin 2. kısa kenar uzunluğu : ");

        kisaKenarIki = inp.nextInt();

        hipotenus = Math.sqrt((kisaKenar * kisaKenar) + (kisaKenarIki * kisaKenarIki));

        alan = (kisaKenar * kisaKenarIki) / 2;

        System.out.println("Dik üçgenizin hipotenüsü = " + hipotenus );
        System.out.println("Dik üçgenizin alani = " + alan );
    }
    
}
