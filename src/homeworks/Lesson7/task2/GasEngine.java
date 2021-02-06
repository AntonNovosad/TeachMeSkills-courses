package homeworks.Lesson7.task2;

public class GasEngine extends Engine {

    public GasEngine(int power) {
        super(power);
    }

    public GasEngine() {
    }


    public void start() {
        System.out.println("Запуск бензинового двигателя мощностью " + getPower() + " Л.С.");
    }
}
