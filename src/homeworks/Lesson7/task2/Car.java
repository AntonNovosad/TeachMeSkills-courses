package homeworks.Lesson7.task2;

import java.util.Random;

public class Car {
    private String marka;
    private int price;
    private Engine engine;
    private GearBox gearBox;

    public Car(String marka, int price, Engine engine, GearBox gearBox) {
        this.marka = marka;
        this.price = price;
        this.engine = engine;
        this.gearBox = gearBox;
    }

    public Car() {
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    private boolean check() {
        boolean check = false;
        Random random = new Random();
        int a = random.nextInt(10);
        return a % 2 == 0;
    }

    public void start() {
        if (check()) {
            engine.start();
            System.out.println(marka + " завелся");
            gearBox.gearBox();
        } else {
            engine.start();
            System.out.println(marka + " не завелась");
        }
    }
}
