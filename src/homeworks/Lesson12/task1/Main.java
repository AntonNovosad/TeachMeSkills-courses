/*
1 - й. Содержит исходный текст.
2 - й. Содержит слова недопустимые в тексте(black list).
Структура файла определите сами, хотите каждое слово на новой строке, хотите через запятую разделяйте, ваша программа делайте как считаете нужным.
Задача: необходимо проверить проходит ли текст цензуру.
Если в тексте не встретилось ни одного недопустимого слова, то выводите сообщение о том что текст прошёл проверку на цензуру.
Если нет, то выводите соответствуюущее сообщение, кол-во предложений не прошедших проверку и сами предложения подлежащие исправлению
 */

package homeworks.Lesson12.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        boolean check = true;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\homeworks\\Lesson12\\task1\\text.txt"))) {
            String lineText;
            while ((lineText = bufferedReader.readLine()) != null) {
                String[] mass = lineText.split(" ");
                try (BufferedReader blackList = new BufferedReader(new FileReader("src\\homeworks\\Lesson12\\task1\\blackList.txt"))) {
                    String listBlackList;
                    while ((listBlackList = blackList.readLine()) != null) {
                        for (String s : mass) {
                            if (listBlackList.equalsIgnoreCase(s)) {
                                check = false;
                                System.out.println("Предложение не прошедшее цензуру: ");
                                System.out.println(lineText);
                                System.out.println("Слово: " + s);
                                System.out.println();
                            }
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (check) {
                System.out.println("Текст прошел проверку на цензуру");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
