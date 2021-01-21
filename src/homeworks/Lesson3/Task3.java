/*
Вычислить: 1 + 2 + 4 + 8 + … + 256.
 */

package homeworks.Lesson3;

public class Task3 {
    public static void main(String[] args) {
        int sum = 1;
        int result = 0;
        for (int i = 1; i <= 256; i *= 2) {
            result = result + sum;
            sum += sum;
        }
        System.out.println("Ответ = " + result);
    }
}
