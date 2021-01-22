/*
В бригаде, работающей на уборке сена, имеется N сенокосилок.
Первая сенокосилка работала m часов, а каждая следующая на 10 минут больше, чем предыдущая.
Сколько часов проработала вся бригада?
 */

package homeworks.Lesson3;

public class TaskAdditional4 {
    public static void main(String[] args) {
        int n = 7;
        int grassCutterHour = 2;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += grassCutterHour * 60 + 10 * i;
        }
        System.out.println("Ответ: " + result / 60);
    }
}
