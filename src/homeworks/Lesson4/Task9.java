/*
Найти средне арифметическое элементов массива, превосходящих некоторое число С.
 */

package homeworks.Lesson4;

import java.util.Arrays;
import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(array));

        int c = 10;
        double counter = 0.0;
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > c) {
                counter++;
                sum += array[i];
            }
        }
        double mean = sum / counter;
        System.out.println("Среднее арифметическое по условию = " + mean);
    }
}
