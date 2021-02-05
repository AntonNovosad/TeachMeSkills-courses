package homeworks.Lesson7.task2;

public class Engine {
    private int power;

    public Engine(int power) {
        this.power = power;
    }

    public Engine() {
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void start(){
        System.out.println("Базовая реалтзация запуска ");
    }
}
