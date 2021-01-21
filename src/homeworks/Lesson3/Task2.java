/*
Одноклеточная амеба каждые 3 часа делится на 2 клетки.
Определить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 */

package homeworks.Lesson3;

public class Task2 {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 3; i <= 24; i += 3) {
            sum *= 2;
            if (i % 100 > 10 && i % 100 < 20) {
                System.out.println("Колличество амеб через " + i + " часов = " + sum);
            } else if (i % 10 >= 2 && i % 10 <= 4) {
                System.out.println("Колличество амеб через " + i + " часа = " + sum);
            } else if (i % 10 == 1) {
                System.out.println("Колличество амеб через " + i + " час = " + sum);
            } else System.out.println("Колличество амеб через " + i + " часов = " + sum);
        }
    }
}
