/*
Создайте массив из 12 случайных целых чисел из отрезка [0;15].
Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
 */

package homeworks.Lesson4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(array));

        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Индекс максимального элемента = " + maxIndex);
    }
}
