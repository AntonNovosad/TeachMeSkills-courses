/*
Вывести на экран таблицу умножения.
 */

package homeworks.Lesson3;

public class TaskAdditional1 {
    public static void main(String[] args) {
        int number = 1;
        int result;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                result = number * (j + 1);
                System.out.print(result + " ");
            }
            number++;
            System.out.println();
        }
    }
}
