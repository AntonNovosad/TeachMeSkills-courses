package homeworks.Lesson7.task1;

public class Transport {
    private String model;
    private int power;
    private int maxSpeed;
    private int mass;

    public Transport(String model, int power, int maxSpeed, int mass) {
        this.model = model;
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
    }

    public Transport() {
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private double powerInKilowatt(int power) {
        return power * 0.74;
    }

    private String abilitiesTransport() {
        return "Мощность двигателя: " + getPower() +
                ". Мощность в киловаттах: " + powerInKilowatt(getPower()) +
                ". Максимальная скорость(км/ч): " + getMaxSpeed() + ". Масса автомобиля: " + getMass();
    }

    public void description(){
        System.out.println(abilitiesTransport());
    }
}
