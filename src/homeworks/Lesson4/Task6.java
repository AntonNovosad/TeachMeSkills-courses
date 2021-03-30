/*
Пользователь вводит с клавиатуры число большее 3, которое сохраняется в переменную n.
Если пользователь ввёл не подходящее число, то программа должна выдать соответствующее сообщение.
Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
 */

package homeworks.Lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите переменную больше 3-х");
        int[] array = new int[0];
        int n = 0;
        boolean isNumber = false;
        boolean isTrueNumber = false;

        do {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                isNumber = true;
            } else {
                System.out.println("Вы ввели не число. Введите число.");
                scanner.next();
            }
            if (n <= 3) {
                System.out.println("Число не соответствует условию");
            } else {
                isTrueNumber = true;
                array = new int[n];
                for (int i = 0; i < array.length; i++) {
                    array[i] = random.nextInt(n);
                }
                System.out.println(Arrays.toString(array));
            }
        } while (!isNumber || !isTrueNumber);

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                counter++;
            }
        }

        int[] arrayChet = new int[counter];
        int chetIndex = -1;
        for (int i = 0; i < arrayChet.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] != 0 && array[j] % 2 == 0 && j != chetIndex) {
                    arrayChet[i] = array[j];
                    chetIndex = j;
                    break;
                }
            }
        }
        System.out.println("Массив с четными элементами");
        System.out.println(Arrays.toString(arrayChet));
    }
}
