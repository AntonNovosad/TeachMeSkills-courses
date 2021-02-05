package homeworks.Lesson7.task2;

public class Main {
    public static void main(String[] args) {
        GasEngine gasEngine = new GasEngine(200);
        DieselEngine dieselEngine = new DieselEngine(300, 2);

        ManualGearBox manualGearBox = new ManualGearBox(5);
        AutomaticGearBox automaticGearBox = new AutomaticGearBox(4, 'R');

        Car car1 = new Car("Audi", 200, gasEngine, manualGearBox);
        Car car2 = new Car("BMW", 300, dieselEngine, automaticGearBox);


        car1.start();
        car1.gearBox();
        System.out.println();
        car2.start();
        car2.gearBox();
    }
}
