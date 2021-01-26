/*
Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его на экран в строку.
Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */

package homeworks.Lesson4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));

        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Массив является строго возрастающим");
        } else System.out.println("Массив НЕ является строго возрастающим");
    }
}
