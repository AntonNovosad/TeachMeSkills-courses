package homeworks.Lesson7.task2;

public class GasEngine extends Engine {

    public GasEngine(int power) {
        super(power);
    }

    public GasEngine() {
    }

    public void startGasEngine(){
        System.out.println("Запуск бензинового двигателя " + getPower());
    }

}
