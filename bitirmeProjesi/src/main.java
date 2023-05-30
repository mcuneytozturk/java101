package bitirmeProjesi.src;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz: ");
        int rows = scanner.nextInt();
        System.out.print("Sütun sayısını giriniz: ");
        int cols = scanner.nextInt();
        System.out.println("=================");
        MineSweeper mineSweeper = new MineSweeper(rows, cols);
        mineSweeper.run();
    }

}
