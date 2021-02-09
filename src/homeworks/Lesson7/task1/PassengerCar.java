package homeworks.Lesson7.task1;

public class PassengerCar extends Ground {
    private String typeCarcass;
    private int numberOfPassengers;


    public PassengerCar(String model, int power, int maxSpeed, int mass, int numberOfWheels, int fuelConsumption, String typeCarcass, int numberOfPassengers) {
        super(model, power, maxSpeed, mass, numberOfWheels, fuelConsumption);
        this.typeCarcass = typeCarcass;
        this.numberOfPassengers = numberOfPassengers;
    }

    public PassengerCar() {
    }

    public String getTypeCarcass() {
        return typeCarcass;
    }

    public void setTypeCarcass(String typeCarcass) {
        this.typeCarcass = typeCarcass;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    private String time(double time) {
        double way = time * getMaxSpeed();
        double rash = (getFuelConsumption() * way) / 100;
        return "За время " + time + " ч, автомобиль " + getModel() +
                " двигаясь с максимальной скоростью " + getMaxSpeed() +
                " км/ч проедет " + way + " км и израсходует " + rash + " литров топлива.";
    }

    private String abilitiesCars() {
        return "Тип кузова: " + typeCarcass + ". Кол-ва пассажиров: " + numberOfPassengers;
    }

    @Override
    public void description() {
        super.description();
        System.out.println(abilitiesCars());
    }

    public void distance(double time) {
        System.out.println(time(time));
    }
}
