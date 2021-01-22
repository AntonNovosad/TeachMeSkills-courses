/*
В сберкассу на трёхпроцентный вклад положили S рублей.
Какой станет сумма вклада через N лет.
 */

package homeworks.Lesson3;

public class TaskAdditional2 {
    public static void main(String[] args) {
        double money = 1000;
        int year = 15;
        for (int i = 0; i < year; i++) {
            money += money * 0.03;
        }
        System.out.println("Сумма вклада = " + money);
    }
}
