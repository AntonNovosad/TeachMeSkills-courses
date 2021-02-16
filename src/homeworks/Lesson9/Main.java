package homeworks.Lesson9;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", 200, 35000);
        Car car2 = new Car("Volvo", 150, 25000);
        Car car3 = new Car("BMW", 250, 40000);

        try {
            car1.start();
            car2.start();
            car3.start();
        } catch (CarExeption carExeption) {
            System.out.println(carExeption.getMessage());
        }
    }
}
