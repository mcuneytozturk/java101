package javaCourse2;

import java.util.Scanner;

public class odevCinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        int birth = input.nextInt();

        int zadiac = birth % 12;

        String zodiacSign;

        //switch statement'a zodiac değeri girilere her bir sayının case durumuna göre değer çekilir çıktı alınır 
        switch (zadiac) {
            case 0:
                zodiacSign = "Maymun";
                break;
            case 1:
                zodiacSign = "Horoz";
                break;
            case 2:
                zodiacSign = "Köpek";
                break;
            case 3:
                zodiacSign = "Domuz";
                break;
            case 4:
                zodiacSign = "Fare";
                break;
            case 5:
                zodiacSign = "Öküz";
                break;
            case 6:
                zodiacSign = "Kaplan";
                break;
            case 7:
                zodiacSign = "Tavşan";
                break;
            case 8:
                zodiacSign = "Ejderha";
                break;
            case 9:
                zodiacSign = "Yılan";
                break;
            case 10:
                zodiacSign = "At";
                break;
            case 11:
                zodiacSign = "Koyun";
                break;
            default:
                zodiacSign = "Yanlış değer girildi!";
        }

        System.out.println("Çin Zodyağı Burcunuz: " + zodiacSign);

        input.close();
    }
}
