package javaCourse7;

import java.util.Scanner;

public class pretikPalindromikKelime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime Palindromik Kelime'dir");

        System.out.print("Bir kelime giriniz: ");
        String word = scanner.nextLine();

        if(isPalindrome(word)){
            System.out.println(word + " - Bir palindromdur");
        } else {
            System.out.println(word + " - Bir palindrom değildir");
        }
    }

    static boolean isPalindrome(String str){
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }

        if(str.equals(reverse)){
            return true;
        } else {
            return false;
        }
    }
}
