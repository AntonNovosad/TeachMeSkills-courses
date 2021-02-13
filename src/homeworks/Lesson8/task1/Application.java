package homeworks.Lesson8.task1;

import java.util.Scanner;

public class Application {
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Hello");
        run();
        System.out.println("Bye");
    }


    private void run() {
        int numberOne = inputNumberOne();
        int numberTwo = inputNumberTwo();
        while (true) {
            Operation value = select();
            if (value == null) {
                break;
            }
            value.calculate(numberOne, numberTwo);
        }
    }


    private Operation select() {
        showMenu();
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.print("Answer is ");
                return new Addition();
            case 2:
                System.out.print("Answer is ");
                return new Subtraction();
            case 3:
                System.out.print("Answer is ");
                return new Multiplication();
            case 4:
                System.out.print("Answer is ");
                return new Division();
            case 0:
                return null;
        }
        System.out.println("Failed");
        return select();
    }

    private int inputNumberOne() {
        System.out.println("Input first number:");
        return scanner.nextInt();
    }

    private int inputNumberTwo() {
        System.out.println("Input second number:");
        return scanner.nextInt();
    }

    private void showMenu() {
        System.out.println("Choice operation");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("0 - Exit");
    }
}
