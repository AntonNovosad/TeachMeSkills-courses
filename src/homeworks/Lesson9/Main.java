package homeworks.Lesson9;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", 200, 35000);
        Car car2 = new Car("Volvo", 150, 25000);
        Car car3 = new Car("BMW", 250, 40000);

        try {
            car1.start();
        } catch (CarException carException) {
            System.out.println(carException.getMessage());
        }

        try {
            car2.start();
        } catch (CarException carException) {
            System.out.println(carException.getMessage());
        }

        try {
            car3.start();
        } catch (CarException carException) {
            System.out.println(carException.getMessage());
        }
    }
}
