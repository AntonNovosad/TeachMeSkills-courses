/*
Найти второй по величине (т.е. следующий по величине за максимальным) элемент в массиве.
 */

package homeworks.Lesson4;

import java.util.Arrays;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(array));

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное значение = " + max);

        int beforeMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                continue;
            } else if (array[i] > beforeMax) {
                beforeMax = array[i];
            }
        }
        System.out.println("Следующее значение по величине = " + beforeMax);
    }
}
