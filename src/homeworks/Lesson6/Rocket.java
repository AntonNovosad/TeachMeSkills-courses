/*
Создать класс Ракета. В классе должны быть:
• Поля
• Конструктор
• Гетеры-сетеры
• методы
Поля класса Ракета:
• Название
• Масса груза
Методы класса Ракета:
• Предстартовая проверка (возвращает true/false в зависимости от того успешно ли она прошла.
Генерируете случайное число, если оно четное, то проверка прошла успешно)
• Старт(Вывод строки в консоль “Ракета {название ракеты} успешно стартанула с грузом в {масса груза}т.”)
 */

package homeworks.Lesson6;

import java.util.Random;

public class Rocket {
    private String nameShip;
    private int mass;

    public Rocket(String nameShip, int mass) {
        this.nameShip = nameShip;
        this.mass = mass;
    }

    public String getNameShip() {
        return nameShip;
    }

    public void setNameShip(String nameShip) {
        this.nameShip = nameShip;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public boolean checkStart() {
        boolean isCheckStart = false;
        Random random = new Random();
        int a = random.nextInt(10);
        return a % 2 == 0;
    }

    public void startRocket() {
        System.out.println("Ракета " + nameShip + " успешно стартанула с грузом в " + mass + "т.");
    }
}
