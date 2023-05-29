package javaCourse6.odevDizidekiElemanlarinFrekansi.src;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class odevDizidekiElemanlarinFrekansi {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        //kullanıcıdan bir dizi oluşturması istenir.

        System.out.print("Dizinin boyutu n : ");
        int n = Scanner.nextInt();

        int[] arr = new int[n];
        int temp = 1;

        while (temp < n + 1){
            System.out.println(temp + ". Elemanı : ");
            arr[temp - 1] = Scanner.nextInt();
            temp++;
        }

        //HashMap, Java'da key-value çiftlerini depolayan bir veri yapısıdır. Her bir anahtar, bir değere eşlenir ve böylece her anahtar benzersiz olmalıdır. Anahtarlar ve değerler herhangi bir nesne türü olabilir.

        //Burda HashMap int ve int sayı değerlerinden oluşuyor yani diziden gelen integer ile ona atanan bir integer key value koyuluyor.

        //frequencyMap dediğide bu key-value çiftlerinin kaydedildiği nesne haritası. hartidaki key-value çiftleri kaydediliyor ve HashMap store'daki metodlar ile çağrılıyor

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Frekans hesaplama
        for (int number : arr) {
            if (frequencyMap.containsKey(number)) {
                //eğer sayı frekans haritasında ise artış frekansın kendisidir.
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            } else {

                //eğer sayı frekans haritasında yoksa 1 değeri ile hartaya eklenir.
                frequencyMap.put(number, 1);
            }
        }

        // Frekans yazdırılır
        for (int number : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(number);
            System.out.println(number + " sayısı frekansı " + frequency+ " tekrar edildi.");
        }

    }
}
