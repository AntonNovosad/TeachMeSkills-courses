/*
Создать список слов.
Написать программу которая выведет в консоль только слова палиндромы
 */

package homeworks.Lesson11;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String[] str = {"Привет", "Довод", "Завод", "Радар", "Стол", "Дом", "Заказ"};

        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].toLowerCase();
        }
        System.out.println(Arrays.toString(str));
        System.out.println();

        StringBuilder stringBuilder = new StringBuilder();
        String newStr;
        System.out.print("Слова палиндромы: ");

        for (int i = 0; i < str.length; i++) {
            stringBuilder.insert(0, str[i]);
            stringBuilder.reverse();
            newStr = stringBuilder.toString();
            stringBuilder.delete(0, str[i].length());
            if (str[i].equals(newStr)) {
                System.out.print(str[i] + " ");
            }
        }
    }
}
