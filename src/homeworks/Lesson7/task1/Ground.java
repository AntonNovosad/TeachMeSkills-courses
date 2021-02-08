package homeworks.Lesson7.task1;

public class Ground extends Transport {
    private int numberOfWheels;
    private int fuelConsumption;

    public Ground(String model, int power, int maxSpeed, int mass, int numberOfWheels, int fuelConsumption) {
        super(model, power, maxSpeed, mass);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public Ground(int numberOfWheels, int fuelConsumption) {
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public Ground() {
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    private String abilitiesGround() {
        return "Количество колес: " + getNumberOfWheels() + ". Расход топлива(л/100км): " + getFuelConsumption();
    }

    @Override
    public void descriptionGround() {
        super.descriptionGround();
        System.out.println(abilitiesGround());
    }

}
