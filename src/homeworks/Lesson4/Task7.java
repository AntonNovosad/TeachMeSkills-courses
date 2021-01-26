/*
Проверить, различны ли все элементы массива.
 */

package homeworks.Lesson4;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(30);
        }
        System.out.println(Arrays.toString(array));

        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    flag = false;
                }
            }
        }
        if (flag == true) {
            System.out.println("Все элемента массива различные");
        } else System.out.println("Элементы массива НЕ различные");
    }
}
