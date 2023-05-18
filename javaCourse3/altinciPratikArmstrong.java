package javaCourse3;

import java.util.Scanner;

public class altinciPratikArmstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin : ");
        int number = scanner.nextInt();
        int basNumber = 0, tempNumber = number, basValue, result = 0, basPow;

        while(tempNumber != 0){
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;

        while(tempNumber != 0){
            basValue = tempNumber % 10;
            basPow = 1;
            for(int i = 1; i <=basNumber; i++){
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if(result == number) {
            System.out.println(number + " sayısı bir armstrong sayısıdır");
        } else {
            System.out.println(number + " sayısı bir armstrong sayısı değildir");
        }

    }
}
