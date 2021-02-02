/*
Создать класс Космодром. В классе должны быть:
• Поля
• Конструктор
• Гетеры-сетеры
• методы
Поля класса Космодром:
• Ракета
Методы класса Космодром:
• Старт(Метод должен у ракеты вызвать метод “Предстартовая проверка”, если она прошла успешно,
то должен произойти обратный отсчет 9…..0 и вызваться у ракеты метод “Старт”.
Если “Предстартовая проверка” провалилась, то вывести соответствующее сообщение).
 */

package homeworks.Lesson6;

public class Cosmodrome {
    private Rocket rocket;

    public Cosmodrome(Rocket rocket) {
        this.rocket = rocket;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public void start() {
        if (rocket.checkStart()) {
            System.out.println("Проверка пройдена.");
            countdown();
            rocket.startRocket();
        } else System.out.println("Проверка провалена. Запуск отменён.");
    }

    private void countdown() {
        System.out.println("Обратный отсчет:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
