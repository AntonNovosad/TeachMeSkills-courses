/*
Игра крестики-нолики.
 */

package homeworks.Lesson5;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] matrix = new char[3][3];
        String playerX = namePlayerX();
        String playerO = namePlayerO();
        System.out.println();

        System.out.println("Игра началась!");
        initialMatrix(matrix);

        gameTicTacToe(matrix, playerX, playerO);
    }

    private static void gameTicTacToe(char[][] matrix, String playerX, String playerO) {
        do {
            System.out.println("Ход игрока " + playerX + "(X)");
            inputElements(matrix, elementX());
            printMatrix(matrix);
            System.out.println("Ход игрока " + playerO + "(O)");
            inputElements(matrix, elementO());
            printMatrix(matrix);
        } while (!checkSameElements(matrix));
        printMatrix(matrix);
    }

    private static boolean checkSameElements(char[][] matrix) {
        boolean sameElements = false;
        if (checkSameElementInRows(matrix)) {
            sameElements = true;
//        }else if (checkSameElementInColumns(matrix)){
//            sameElements = true;
//        }else if (checkSameElementInDiagonal(matrix)){
//            sameElements = true;
//        }else if (checkSameElementInReverseDiagonal(matrix)){
//            sameElements = true;
        } else{
            counterSteps(matrix);
        }
        return sameElements;
    }

    private static boolean counterSteps(char[][] matrix) {
        boolean counterSteps = false;
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == elementX() || matrix[i][j] == elementO())
                    counter++;
            }
        }
        if (counter == 9) {
            System.out.println("Ничья");
            counterSteps = true;
        }
        return counterSteps;
    }

    private static boolean checkSameElementInDiagonal(char[][] matrix) {
        boolean sameElements = false;
        int counterX = 0;
        int counterO = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][i] == elementX()) {
                    counterX++;
                } else if (matrix[i][i] == elementO()) {
                    counterO++;
                }
            }
        }
        if (counterX == 3) {
            sameElements = true;
            System.out.println("Игра окончена. " + namePlayerX() + "(Х) победил.");
        } else if (counterO == 3) {
            sameElements = true;
            System.out.println("Игра окончена. " + namePlayerO() + "(O) победил.");
        }
        return sameElements;
    }

    private static boolean checkSameElementInReverseDiagonal(char[][] matrix) {
        boolean sameElements = false;
        int counterX = 0;
        int counterO = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][matrix.length - 1 - i] == elementX()) {
                    counterX++;
                } else if (matrix[i][matrix.length - 1 - i] == elementO()) {
                    counterO++;
                }
            }
        }
        if (counterX == 3) {
            sameElements = true;
            System.out.println("Игра окончена. " + namePlayerX() + "(Х) победил.");
        } else if (counterO == 3) {
            sameElements = true;
            System.out.println("Игра окончена. " + namePlayerO() + "(O) победил.");
        }
        return sameElements;
    }

    private static boolean checkSameElementInColumns(char[][] matrix) {
        boolean sameElementInColumns = false;
        int counterX;
        int counterO;
        char[] columns = new char[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            counterX = 0;
            counterO = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (columns[j] == elementX()) {
                    counterX++;
                } else if (columns[j] == elementO()) {
                    counterO++;
                }
            }
            if (counterX == 3) {
                sameElementInColumns = true;
                System.out.println("Игра окончена. " + namePlayerX() + "(Х) победил.");
                break;
            } else if (counterO == 3) {
                sameElementInColumns = true;
                System.out.println("Игра окончена. " + namePlayerO() + "(O) победил.");
                break;
            }
        }
        return sameElementInColumns;
    }

    private static boolean checkSameElementInRows(char[][] matrix) {
        boolean sameElementsInRows = false;
        int counterX;
        int counterO;
        for (int i = 0; i < matrix.length; i++) {
            counterX = 0;
            counterO = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == elementX()) {
                    counterX++;
                } else if (matrix[i][j] == elementO()) {
                    counterO++;
                }
            }
            if (counterX == 3) {
                sameElementsInRows = true;
                System.out.println("Игра окончена. " + namePlayerX() + "(Х) победил.");
                break;
            } else if (counterO == 3) {
                sameElementsInRows = true;
                System.out.println("Игра окончена. " + namePlayerO() + "(O) победил.");
                break;
            }
        }
        return sameElementsInRows;
    }

    private static void inputElements(char[][] matrix, char element) {
        int coordinateX = coordinateInputX();
        int coordinateY = coordinateInputY();
        boolean isTrue = false;
        do {
            if (matrix[coordinateX - 1][coordinateY - 1] == elementX()) {
                System.out.println("Ячейка занята! Повторите ввод");
                coordinateInputX();
                coordinateInputY();
            } else if (matrix[coordinateX - 1][coordinateY - 1] == elementO()) {
                System.out.println("Ячейка занята! Повторите ввод");
                coordinateInputX();
                coordinateInputY();
            } else {
                isTrue = true;
            }
        } while (!isTrue);
        matrix[coordinateX - 1][coordinateY - 1] = element;
    }

    private static int coordinateInputX() {
        int coordinateX = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите ряд (1 - 3)");
        boolean isNumber = false;
        do {
            if (scanner.hasNextInt()) {
                coordinateX = scanner.nextInt();
                isNumber = true;
            } else {
                System.out.println("Вы ввели не число. Введите число.");
                scanner.next();
            }
            if (coordinateX < 1 || coordinateX > 3) {
                System.out.println("Вы вышли за пределы поля");
                System.out.println("Выберите ряд (1 - 3)");
                isNumber = false;
            }
        } while (!isNumber);
        return coordinateX;
    }

    private static int coordinateInputY() {
        int coordinateY = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите колонку (1 - 3)");
        boolean isNumber = false;
        do {
            if (scanner.hasNextInt()) {
                coordinateY = scanner.nextInt();
                isNumber = true;
            } else {
                System.out.println("Вы ввели не число. Введите число.");
                scanner.next();
            }
            if (coordinateY < 1 || coordinateY > 3) {
                System.out.println("Вы вышли за пределы поля");
                System.out.println("Выберите колонку (1 - 3)");
                isNumber = false;
            }
        } while (!isNumber);
        return coordinateY;
    }

    private static char elementX() {
        return 'X';
    }

    private static char elementO() {
        return 'O';
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
    }

    private static String namePlayerX() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя игрока за Х:");
        return scanner.nextLine();
    }

    private static String namePlayerO() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя игрока за O:");
        return scanner.nextLine();
    }

    private static void initialMatrix(char[][] matrix) {
        char point = '.';
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = point;
                System.out.print(point + " ");
            }
            System.out.println();
        }
    }
}
