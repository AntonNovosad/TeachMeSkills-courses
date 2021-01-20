/*
 Даны 3 целых числа.
 Найти количество положительных и отрицательных чисел в исходном наборе.
 */

package homeworks.Lesson2;

public class Task5 {
    public static void main(String[] args) {
        int a, b, c;
        a = -3;
        b = 5;
        c = -2;
        int counterPositive = 0;
        int counterNegative = 0;
        if (a > 0) {
            counterPositive++;
        } else counterNegative++;
        if (b > 0) {
            counterPositive++;
        } else counterNegative++;
        if (c > 0) {
            counterPositive++;
        } else counterNegative++;
        System.out.println("Количество положительных чисел = " + counterPositive);
        System.out.println("Количество отрицательных чисел = " + counterNegative);
    }
}
