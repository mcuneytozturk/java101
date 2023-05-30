package bitirmeProjesi.src;

import java.util.Scanner;
import java.util.Random;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    int[][] mineField;
    boolean[][] revealed;
    int mineCount;
    int remainingCells;
    boolean gameWon;
    boolean gameLost;

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.mineField = new int[rowNumber][colNumber];
        this.revealed = new boolean[rowNumber][colNumber];
        this.mineCount = rowNumber * colNumber / 4;
        this.remainingCells = rowNumber * colNumber - mineCount;
        this.gameWon = false;
        this.gameLost = false;
    }

    public void run() {
        placeMines();
        while (!gameWon && !gameLost) {
            printMineField();
            System.out.print("Satır giriniz: ");
            int row = scanner.nextInt();
            System.out.print("Sütun giriniz: ");
            int col = scanner.nextInt();
            System.out.println("=================");
            if (isValidCell(row, col)) {
                if (isMine(row, col)) {
                    gameLost = true;
                    System.out.println("Mayına bastınız! Oyunu kaybettiniz.");
                } else {
                    revealCell(row, col);
                    if (remainingCells == 0) {
                        gameWon = true;
                        System.out.println("Tebrikler! Tüm noktaları seçtiniz. Oyunu kazandınız.");
                    }
                }
            } else {
                System.out.println("Geçersiz bir nokta girdiniz. Lütfen tekrar deneyin.");
            }
        }
    }

    private void placeMines() {
        int count = mineCount;
        while (count > 0) {
            int row = random.nextInt(rowNumber);
            int col = random.nextInt(colNumber);
            if (mineField[row][col] != -1) {
                mineField[row][col] = -1;
                count--;
            }
        }
    }

    private boolean isValidCell(int row, int col) {
        return row >= 0 && row < rowNumber && col >= 0 && col < colNumber && !revealed[row][col];
    }

    private boolean isMine(int row, int col) {
        return mineField[row][col] == -1;
    }

    private void revealCell(int row, int col) {
        if (isValidCell(row, col)) {
            revealed[row][col] = true;
            remainingCells--;
            int mineCount = getSurroundingMineCount(row, col);
            mineField[row][col] = mineCount;
            if (mineCount == 0) {
                revealSurroundingCells(row, col);
            }
        }
    }

    private int getSurroundingMineCount(int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < rowNumber && j >= 0 && j < colNumber && mineField[i][j] == -1) {
                    count++;
                }
            }
        }
        return count;
    }

    private void revealSurroundingCells(int row, int col) {
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                revealCell(i, j);
            }
        }
    }

    private void printMineField() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                if (revealed[i][j]) {
                    if (mineField[i][j] == -1) {
                        System.out.print("* ");
                    } else {
                        System.out.print(mineField[i][j] + " ");
                    }
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
