package javaCourse6.odevMatrisTranspozu.src;

import java.util.Scanner;

public class odevMatrisTranspozu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan matrisin boyutlarını alalım
        System.out.print("Matrisin satır sayısını girin: ");
        int rows = scanner.nextInt();

        System.out.print("Matrisin sütun sayısını girin: ");
        int cols = scanner.nextInt();

        // Matrisin boyutlarına göre yeni bir matris oluşturalım
        int[][] matrix = new int[rows][cols];

        // Kullanıcıdan matrisin elemanlarını girmesini isteyelim
        System.out.println("Matrisin elemanlarını girin:");
        int tempOne = 0;
        int tempTwo = 0;

        while (tempOne < rows) {
            while (tempTwo < cols) {
                matrix[tempOne][tempTwo] = scanner.nextInt();
                tempTwo++;
            }
            tempOne++;
            tempTwo = 0;
        }
        // Transpoz matrisi için yeni bir matris oluşturalım
        int[][] transpose = new int[cols][rows];

        // Matrisin transpozunu hesaplayalım
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Matrisin transpozunu ekrana yazdıralım
        System.out.println("Matrisin Transpozu:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
