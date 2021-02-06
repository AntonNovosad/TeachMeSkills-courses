package homeworks.Lesson7.task2;

public class DieselEngine extends Engine {

    private int volume;

    public DieselEngine(int power, int volume) {
        super(power);
        this.volume = volume;
    }

    public DieselEngine() {
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void start() {
        System.out.println("Запуск дизельного двигателя мощностью " + getPower() + " Л.С. и объемом " + volume + "л.");
    }
}
