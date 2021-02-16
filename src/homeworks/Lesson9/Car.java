package homeworks.Lesson9;

import java.util.Random;

public class Car {
    private String marka;
    private int speed;
    private int price;

    public Car(String marka, int speed, int price) {
        this.marka = marka;
        this.speed = speed;
        this.price = price;
    }

    public Car() {
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void start() throws CarExeption {
        Random random = new Random();
        int number = random.nextInt(20);
        if (number % 2 == 0) {
            throw new CarExeption(number);
        } else System.out.println("Машина маркой " + marka + " завелась.");
    }
}
