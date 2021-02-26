/*
Переменная содержит число в формате "9999999".
Нужно преобразовать строку в "9 999 999" - что бы было разбитие разрядов
 */

package homeworks.Lesson11;

public class Task1 {
    public static void main(String[] args) {
        int number = 9999999;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(number));
        for (int i = stringBuilder.length() - 3; i > 0; i -= 3) {
            stringBuilder.insert(i, ' ');
        }
        System.out.println(stringBuilder);

        // через String

        String str = String.valueOf(number);
        String newStr;
        for (int i = str.length() - 3; i > 0; i -= 3) {
            int temp = str.length();
            newStr = str.substring(i, temp);
            str = str.substring(0, i);
            str = str.concat(" ").concat(newStr);
        }
        System.out.println(str);

    }
}
