/*
В переменную записываем число.
Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
Например, "это однозначное положительное число".
Достаточно будет определить, является ли число однозначным, двухзначным или трехзначным и более.
 */

package Homeworks.Lesson2;

public class Task1 {
    public static void main(String[] args) {
        int a = 123;
        if (a < 0) {
            if (a > -10 && a != 0) {
                System.out.println("это однозначное отрицательное число");
            } else if (a > -100 && a < -9) {
                System.out.println("это двузначное отрицательное число");
            } else if (a > -1000 && a < -99) {
                System.out.println("это трехзначное отрицательное число");
            }
        }else{
            if (a < 10 && a != 0) {
                System.out.println("это однозначное положительное число");
            } else if (a > 9 && a < 100) {
                System.out.println("это двузначное положительное число");
            } else if (a > 99 && a < 1000) {
                System.out.println("это трехзначное положительное число");
            }
        }
    }
}
