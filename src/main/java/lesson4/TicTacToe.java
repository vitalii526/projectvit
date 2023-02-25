package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static final int SIZE = 3;

    private static final char DOT_EMTY = '.';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';

    private static final char[][] MAP = new char[SIZE][SIZE];

    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();
    private static int turnsCount = 0;
    public static final String HEADER_FIRST_SYMBOL = "*";
    public static final String SPACE_MAP_SYMBOL = " ";

    public static void main(String[] args) {
        turnGame();
    }

    public static void turnGame() {
        initMap();
        printMap();
        playGame();
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
            if (checkEND(DOT_HUMAN)) {
                break;
            }


            aiTurn();
            printMap();
            if (checkEND(DOT_AI)) {
                break;
            }
        }
    }

    private static boolean checkEND(char symbol) {


        if (chekDRAW()) {
            System.out.println("НИЧЬЯ!");
            return true;
        }
        return false;
    }

    private static boolean chekDRAW() {
 //      for (char[] chars : MAP) {
   //        for (char symbol : chars) {
 //              if (symbol == DOT_EMPTY) {
 //                  return false;
 //              }
//            }
//        }
//        return true;

        return turnsCount >= SIZE * SIZE;
    }

    private static boolean checkWin(char symbol) {
        return false;
    }

    private static void aiTurn() {
        System.out.println("\nХОД КОМПЬЮТЕРА!");

        int rowNumber;
        int columnNumber;

        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);
        } while (!isCellFree(rowNumber, columnNumber));

        MAP[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;
    }

    private static void humanTurn() {
        System.out.println("\nХОД ЧЕЛОВЕКА!");

        int rowNumber;
        int columnNumber;

        while (true) {
            System.out.println("Введите координату строки: ");
            rowNumber = in.nextInt() - 1;

            System.out.println("Введите координату столбца: ");
            columnNumber = in.nextInt() - 1;

            if (isCellFree(rowNumber, columnNumber)){
                break;
            }

            System.out.printf("ОШИБКА! Ячейка с координатами %s:%s уже используется%n", rowNumber + 1, columnNumber + 1);
        }

        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;
    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMTY;
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMTY;
            }
        }
    }

    private static void printMap() {
        printHeaderMap();
        printBodyMap();
    }

    private static void printBodyMap() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP_SYMBOL);
            }
            System.out.println();
        }
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP_SYMBOL);
    }

    private static void printHeaderMap() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP_SYMBOL);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }
}
