/*
Найти максимальный элемент в массиве и поменять его местами с нулевым элементом.
 */

package homeworks.Lesson4;

import java.util.Arrays;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(array));

        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Максимальное значение = " + max);

        array[maxIndex] = array[0];
        array[0] = max;
        System.out.println("Ответ");
        System.out.println(Arrays.toString(array));
    }
}
