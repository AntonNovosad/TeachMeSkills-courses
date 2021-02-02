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
        createInitialMatrix(matrix);

        gameTicTacToe(matrix, playerX, playerO);
    }

    private static void gameTicTacToe(char[][] matrix, String playerX, String playerO) {
        boolean isXStep = true;
        char element;
        String playerName;
        do {
            if (isXStep) {
                element = elementX();
                playerName = playerX;
            } else {
                element = elementO();
                playerName = playerO;
            }
            System.out.println("Ход игрока " + playerName + "(" + element + ")");
            inputElements(matrix, element);
            printMatrix(matrix);
            isXStep = !isXStep;
        } while (!isGameFinished(matrix));
        System.out.println();
        if (isDraw(matrix)) {
            System.out.println("Ничья");
        } else printGameResult(playerName, element);
    }

    private static void printGameResult(String playerName, char element) {
        System.out.println("Игра окончена. " + playerName + "(" + element + ") победил.");
    }

    private static boolean isGameFinished(char[][] matrix) {
        return isSomebodyWin(matrix) || isDraw(matrix);
    }

    private static boolean isSomebodyWin(char[][] matrix) {
        return checkSameElementInRows(matrix) ||
                checkSameElementInColumns(matrix) ||
                checkSameElementInDiagonal(matrix) ||
                checkSameElementInReverseDiagonal(matrix);
    }

    private static boolean isDraw(char[][] matrix) {
        int counter = 0;
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                if (aChar == elementX() || aChar == elementO())
                    counter++;
            }
        }
        return  (counter == 9 && !isSomebodyWin(matrix));
    }

    private static boolean checkSameElementInDiagonal(char[][] matrix) {
        int counterX = 0;
        int counterO = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] == elementX()) {
                counterX++;
            } else if (matrix[i][i] == elementO()) {
                counterO++;
            }
        }
        return counterX == 3 || counterO == 3;
    }

    private static boolean checkSameElementInReverseDiagonal(char[][] matrix) {
        int counterX = 0;
        int counterO = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][matrix.length - 1 - i] == elementX()) {
                counterX++;
            } else if (matrix[i][matrix.length - 1 - i] == elementO()) {
                counterO++;
            }
        }
        return counterX == 3 || counterO == 3;
    }

    private static boolean checkSameElementInColumns(char[][] matrix) {
        int counterX;
        int counterO;
        char[] columns = new char[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            counterX = 0;
            counterO = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                columns[j] = matrix[j][i];
                char element = columns[j];
                if (element == elementX()) {
                    counterX++;
                } else if (element == elementO()) {
                    counterO++;
                }
            }
            return counterO == 3 || counterX == 3;
        }
        return false;
    }

    private static boolean checkSameElementInRows(char[][] matrix) {
        int counterX;
        int counterO;
        for (char[] chars : matrix) {
            counterX = 0;
            counterO = 0;
            for (char aChar : chars) {
                if (aChar == elementX()) {
                    counterX++;
                } else if (aChar == elementO()) {
                    counterO++;
                }
            }
            return counterX == 3 || counterO == 3;
        }
        return false;
    }


    private static void inputElements(char[][] matrix, char element) {
        int coordinateX = coordinateInputX();
        int coordinateY = coordinateInputY();
        boolean isInputValid = false;
        do {
            if (matrix[coordinateX - 1][coordinateY - 1] == elementX()) {
                System.out.println("Ячейка занята! Повторите ввод");
                coordinateX = coordinateInputX();
                coordinateY = coordinateInputY();
            } else if (matrix[coordinateX - 1][coordinateY - 1] == elementO()) {
                System.out.println("Ячейка занята! Повторите ввод");
                coordinateX = coordinateInputX();
                coordinateY = coordinateInputY();
            } else {
                isInputValid = true;
            }
        } while (!isInputValid);
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
                continue;
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
                continue;
            }
            if (coordinateY < 1 || coordinateY > 3) {
                System.out.println("Вы вышли за пределы поля");
                System.out.println("Выберите колонку (1 - 3)");
                isNumber = false;
            }
        } while (!isNumber);
        return coordinateY;
    }

    private static char elementEmpty() {
        return '.';
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

    private static void createInitialMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = elementEmpty();
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
