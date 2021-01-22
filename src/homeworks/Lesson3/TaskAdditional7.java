/*
Бизнессмен взял ссуду m тысяч рублей в банке под 20% годовых.
Через сколько лет его долг превысит s тысяч рублей, если за это время он не будет отдавать долг.
 */

package homeworks.Lesson3;

public class TaskAdditional7 {
    public static void main(String[] args) {
        double money = 1000;
        double max = 5000;
        int counter = 0;
        while (money < max) {
            money += money * 0.2;
            counter++;
        }
        System.out.println("Ответ: " + counter);
    }
}
