/*
Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий массив из 10 действительных чисел.
Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из
первого массива с i-ым индексом к элементу из второго массива с i-ым индексом.
Вывести все три массива на экран (каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве.
 */

package homeworks.Lesson4;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        double[] array1 = new double[10];
        double[] array2 = new double[10];
        double[] array3 = new double[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(10);
            array2[i] = random.nextInt(10);
        }
        for (int i = 0; i < array3.length; i++) {
            if (array1[i] == 0 || array2[i] == 0) {
                array3[i] = 0;
            } else array3[i] = array1[i] / array2[i];
        }
        System.out.println("1-й массив:");
        System.out.println(Arrays.toString(array1));
        System.out.println("2-й массив:");
        System.out.println(Arrays.toString(array2));
        System.out.println("3-й массив:");
        System.out.println(Arrays.toString(array3));

        int counter = 0;
        for (int i = 0; i < array3.length; i++) {
            if (array1[i] % array2[i] == 0 && array3[i] != 0) {
                counter++;
            }
        }
        System.out.println("Колличество целых элементов = " + counter);
    }
}
