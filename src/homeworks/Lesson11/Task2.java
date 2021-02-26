/*
Создать список слов.
Написать программу которая выведет в консоль только слова палиндромы
 */

package homeworks.Lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Task2 {
    public static void main(String[] args) {
        String[] str = {"Привет", "Довод", "Завод", "Радар", "Стол", "Дом", "Заказ"};

        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].toLowerCase();
        }
        System.out.println(Arrays.toString(str));
        System.out.println();

        System.out.print("Слова палиндромы: ");

        for (int i = 0; i < str.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(str[i]);
            stringBuilder.reverse();
            if (stringBuilder.toString().equals(str[i])) {
                System.out.print(str[i] + " ");
            }
        }

        // через List

        System.out.println();
        System.out.println("Через List: ");
        List<String> strings = new ArrayList<>();
        strings.add("Привет");
        strings.add("Довод");
        strings.add("Завод");
        strings.add("Радар");
        strings.add("Стол");

        for (String s : strings) {
            StringBuilder stringBuilder = new StringBuilder(s);
            stringBuilder.reverse();
            if (stringBuilder.toString().equalsIgnoreCase(s)) {
                System.out.println(s);
            }
        }
    }
}
