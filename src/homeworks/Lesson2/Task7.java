/*
В переменную записываете количество программистов.
В зависимости от количества программистов необходимо вывести правильно окончание.
Например:
• 2 программиста
• 1 программист
• 10 программистов
• и т.д.
 */

package homeworks.Lesson2;

public class Task7 {
    public static void main(String[] args) {
        int a = 114;
        if (a % 100 > 10 && a % 100 < 20) {
            System.out.println(a + " программистов");
        } else if (a % 10 == 2 || a % 10 == 3 || a % 10 == 4) {
            System.out.println(a + " программиста");
        } else if (a % 10 == 1) {
            System.out.println(a + " программист");
        } else System.out.println(a + " программистов");
    }
}
