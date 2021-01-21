/*
Напишите программу печати таблицы перевода расстояний из дюймов в
сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
 */

package homeworks.Lesson3;

public class Task5 {
    public static void main(String[] args) {
        double cm = 2.54;
        double result;
        System.out.println("Дюймы | Сантиметры");
        for (int i = 1; i <= 20; i++) {
            result = cm * i;
            System.out.println("  " + i + "  =  " + result);
        }
    }
}
