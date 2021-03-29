package homeworks.Lesson14.cities.util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);


    public static String getString(){
        if(scanner.hasNextInt()){
            scanner.nextLine();
            System.out.println("Это не слово! Повторите ввод");
            return getString();
        }
        return scanner.next();
    }

    public static String getString(String message) {
        System.out.println(message);
        return getString();
    }
}
