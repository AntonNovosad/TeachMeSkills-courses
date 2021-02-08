package homeworks.Lesson7.task1;

public class AutoTruck extends Ground {
    private int carryingCapacity; // грузоподъемность

    public AutoTruck(String model, int power, int maxSpeed, int mass, int numberOfWheels, int fuelConsumption, int carryingCapacity) {
        super(model, power, maxSpeed, mass, numberOfWheels, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    public AutoTruck() {
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public void carrying(double kilogram) {
        if (kilogram < carryingCapacity && kilogram >= 0) {
            carryingCapacity -= kilogram;
            System.out.println("Груз массой " + kilogram + " кг. загружен, свободным осталось еще " + carryingCapacity + " кг");
        } else if (kilogram == carryingCapacity) {
            carryingCapacity -= kilogram;
            System.out.println("Грузовик загружен");
        } else System.out.println("Вам нужен грузовик побольше");
    }

    private String abilitiesTruck() {
        return "Грузоподъемность: " + carryingCapacity;
    }

    @Override
    public void descriptionGround() {
        super.descriptionGround();
        System.out.println(abilitiesTruck());
    }
}
