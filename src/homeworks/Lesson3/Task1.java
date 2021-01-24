/*
Начав тренировки, спортсмен в первый день пробежал 10 км.
Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
Какой суммарный путь пробежит спортсмен за 7 дней?
 */

package homeworks.Lesson3;

public class Task1 {
    public static void main(String[] args) {
        double way = 10.0;
        double result = 0;
        for (int i = 0; i < 7; i++) {
            result += way;
            way += way * 0.1;
        }
        System.out.println("Суммарный путь = " + result + " км");
    }
}
