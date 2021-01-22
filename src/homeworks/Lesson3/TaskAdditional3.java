/*
Составьте программу, которая вычисляет сумму квадратов чисел от 1 до введенного вами целого числа N.
 */

package homeworks.Lesson3;

public class TaskAdditional3 {
    public static void main(String[] args) {
        int number = 1;
        int n = 10;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += number * number;
            number++;
        }
        System.out.println("Ответ = " + result);
    }
}
