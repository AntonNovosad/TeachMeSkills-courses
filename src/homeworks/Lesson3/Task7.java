/*
Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99.
 */

package homeworks.Lesson3;

public class Task7 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i < 100; i+=2) {
            result += i;
        }
        System.out.println("Ответ = " + result);
    }
}
