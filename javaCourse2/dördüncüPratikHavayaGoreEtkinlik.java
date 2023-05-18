package javaCourse2;

import java.util.Scanner;

public class dördüncüPratikHavayaGoreEtkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double heat;

        System.out.print("Orda hava kaç derece gardaş ? ");
        heat = input.nextDouble();

        if (heat > 25) {
            System.out.println("e yüzmeye gitsene bu sıcakta dicem ama yüzme havuzlarında çok klor kullanılıyor alerjin yoksa bile derini aşındırcak sonra hastaneye gitcen masraflar olcak binlere onbinlere kredi çekcen hastasın çalışamıcan ödeyemicen evin elinden gidecek boşver otur evinde ya");
        } else if( heat > 15) {
            System.out.println("Al çoluğu çocuğu eşi dostu haydeee pikniğe derdim ama şimdi arkadaşların top oynayalım dicek koşcan koşcan yorulcan terlicen rüzgar escek hasta olcan zatüreden yatcan yatağa kalkamıcan işe gidemicen kovulcan boşver otur evinde ya");
        } else if ( heat > 5) {
            System.out.println("Sinemaya git derdim ama baya pahalılaşmış o parayla elektrik faturanı ödemen gerekecektir elektrik kesilcek çalışamıcan stres olcan kanser olcan boşver otur evinde yaaaa");
        } else {
            System.out.println("Kayak yap derdim ama şimdi kayak olmuştur kaç para sakatlancan etcen işe gidemicen paran kesilcek boşver otur evinde yaaa");
        }

    }
}
