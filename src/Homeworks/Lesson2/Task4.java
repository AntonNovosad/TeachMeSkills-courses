/*
Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
 */

package Homeworks.Lesson2;

public class Task4 {
    public static void main(String[] args) {
        int a, b, c;
        a = -3;
        b = 5;
        c = -2;
        int counterPositive = 0;
        if (a > 0) {
            counterPositive++;
        }
        if (b > 0) {
            counterPositive++;
        }
        if (c > 0) {
            counterPositive++;
        }
        System.out.println("Количество положительный чисел = " + counterPositive);
    }
}
