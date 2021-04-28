package ru.geekbrains.java_level_one.lession4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ForthClass {

    public static char[][] map;
    public static int SIZE = 8;
    private static final int maxTurns = SIZE * SIZE;
    private static int turns = 0;
    private static final char X_DOT = 'X';
    private static final char O_DOT = 'O';
    private static final char EMPTY_DOT = '•';
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        initMap();
        drawMap();
        do {
            humanTurn();
            drawMap();
            if (checkWin(X_DOT)) {
                System.out.println("You Won!");
                break;
            }
            machineTurn();
            drawMap();
            if (checkWin(O_DOT)) {
                System.out.println("You Loose!");
                break;
            }
            if (turns == maxTurns) {
                System.out.println("No free fields - DRAW!");
                break;
            }
        } while (true);
    }

    private static void initMap() { //game field initialisation
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(map[i],EMPTY_DOT);
//            for (int j = 0; j < SIZE; j++) {
//                map[i][j] = EMPTY_DOT;
//            }
        }
    }

    public static void drawMap() {  //game field to console drawing
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {    // X-axis drawing
        System.out.print((i+1));
        }
        System.out.println("X");
        for (int i = 0; i < SIZE; i++) {    //Y-axis and field drawing
            System.out.print((i+1)+" ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
        System.out.println("Y");
    }

    private static void machineTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (map[x][y] != EMPTY_DOT);   //check if cell is empty (means its inside game field)
        map[x][y] = O_DOT;
        System.out.println("Machine put O to " + (y + 1) + " " + (x + 1));
        turns++;
    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.println("please input X Y");
            x = scanner.nextInt();
            y = scanner.nextInt();
        } while (map[y - 1][x - 1] != EMPTY_DOT);
        map[y - 1][x - 1] = X_DOT;
        turns++;
        //scanner.close();  REALLY don't understand yet why we shouldn't close scanner??
    }

    private static boolean checkWin(char symbol) {
        return checkRows(symbol) || checkCols(symbol) || checkDiags(symbol);
    }


    private static boolean checkLine(int lineNumber, char symbol) { //have to made this method to simplify
        int i = 0;
        int fullLine = 0;
        while (i < SIZE) {
            if (map[lineNumber][i] == symbol) {
                fullLine++;
            }
            i++;
        }
        return fullLine == SIZE;
    }

    private static boolean checkVertLine(int lineNumber, char symbol) { //have to made this method to simplify
        int i = 0;
        int fullLine = 0;
        while (i < SIZE) {
            if (map[i][lineNumber] == symbol) {
                fullLine++;
            }
            i++;
        }
        return fullLine == SIZE;
    }


    private static boolean checkRows(char symbol) {
        for (int y = 0; y < SIZE; y++) {
            if (checkLine(y, symbol)) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkCols(char symbol) {
        for (int x = 0; x < SIZE; x++) {
            if (checkVertLine(x, symbol)) {
                return true;
            }
        }
        return false;
    }


    private static boolean checkDiags(char symbol) {
        int fullLine = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == symbol) {
                fullLine++;
            }
        }
        if (fullLine == SIZE) {
            return true;
        }

        fullLine = 0;
        for (int i = 0, j = SIZE - 1; i < SIZE; i++, j--) {
            if (map[i][j] == symbol) {
                fullLine++;
            }
        }
        return fullLine == SIZE;
    }

}
