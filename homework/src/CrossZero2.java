import java.util.Random;
import java.util.Scanner;

public class CrossZero2 {

    public static final char HUMAN = 'O';
    public static final char PC = 'X';
    public static final char EMPTY = '_';

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();

    public static int fieldSizeX;
    public static int fieldSizeY;
    public static char[][] field;

    public static void createMap() {
        fieldSizeX = 3;
        fieldSizeY = 3;
        field = new char[fieldSizeY][fieldSizeX];

        for (int x = 0; x < fieldSizeY; x++) {
            for (int y = 0; y < fieldSizeX; y++) {
                field[x][y] = EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int x = 0; x < fieldSizeX; x++) {
            for (int y = 0; y < fieldSizeY; y++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты клетки, сначала по оси х, затем по оси у ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!checkValidCell(y, x) || !checkEmptyCell(y, x));
        field[y][x] = HUMAN;
    }

    public static void pcTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX); // 0...2
            y = RANDOM.nextInt(fieldSizeY);
        } while (!checkEmptyCell(y, x));
        field[y][x] = PC;
    }

    public static boolean checkValidCell(int y, int x) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    public static boolean checkEmptyCell(int y, int x) {
        return field[y][x] == EMPTY;
    }

    public static boolean checkWinCycle(char c) {
        for (int x = 0; x < field.length; x++) {
            if (field[x][0] == c && field[x][1] == c && field[x][2] == c) return true;
            if (field[0][x] == c && field[1][x] == c && field[2][x] == c) return true;
            if (field[0][0] == c && field[1][1] == c && field[2][2] == c) return true;
            if (field[0][2] == c && field[1][1] == c && field[2][0] == c) return true;
        }
        return false;
    }

    public static boolean isFullMap() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == EMPTY) return false;
            }
        }
        return true;
    }

    public static void draw() {
        if (isFullMap() == true) System.out.println("ничья");
    }

    public static void main(String[] args) {

        createMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWinCycle(HUMAN)) {
                System.out.println("Позравляю человека с подедой!!");
                break;
            }
            if (isFullMap()) {
                System.out.println("ничья");
                break;
            }
            pcTurn();
            System.out.println();
            printMap();
            if (checkWinCycle(PC)) {
                System.out.println("Позравляю комп с подедой!!");
                break;
            }
            if (isFullMap()) {
                System.out.println("ничья");
                break;
            }
            System.out.println();
        }
    }
}
