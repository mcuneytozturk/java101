package javaCourse4;

import java.util.Scanner;

public class birinciPratikPalindromSayilar {

    static boolean isPalindrome(int number){
        int temp = number, reverseNum = 0, lastNumber = 0;

        while (temp != 0){
            lastNumber = temp % 10;
            reverseNum = (reverseNum * 10) + lastNumber;
            temp /= 10;
        }

        if(reverseNum == number){
            return true;
        } else {
            return false;
        }
    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        if(isPalindrome(number)){
            System.out.println(number + " sayısı bir palindromdur");
        } else {
            System.out.println(number + " sayısı bir palindrom değildir");
        }
    }
}
