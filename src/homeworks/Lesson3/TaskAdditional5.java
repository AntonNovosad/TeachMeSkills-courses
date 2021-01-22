/*
Задано натуральное число N.
Найти количество натуральных чисел, не превосходящих N и не делящихся ни на одно из чисел 2,3,5.
 */

package homeworks.Lesson3;

public class TaskAdditional5 {
    public static void main(String[] args) {
        int n = 245;
        int counter = 0;
        int number = 1;
        for (int i = 0; i < n; i++) {
            if (number < n && number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
                counter++;
            }
            number++;
        }
        System.out.println("Ответ по условию = " + counter);
    }
}
