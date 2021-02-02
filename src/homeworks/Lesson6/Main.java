/*
В main создайте Ракету и Космодром. Запустите ракету в космос.
 */

package homeworks.Lesson6;

public class Main {
    public static void main(String[] args) {
        Rocket normandy = new Rocket("Normandy", 20);
        Cosmodrome baikonur = new Cosmodrome(normandy);

        baikonur.start();
    }
}
