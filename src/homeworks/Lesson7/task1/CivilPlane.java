package homeworks.Lesson7.task1;

public class CivilPlane extends Air {
    private int numberOfPassengers;
    private boolean businessClass;

    public CivilPlane(String model, int power, int maxSpeed, int mass, int wingspan, int minimumRunway, int numberOfPassengers, boolean businessClass) {
        super(model, power, maxSpeed, mass, wingspan, minimumRunway);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClass = businessClass;
    }

    public CivilPlane() {
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    private String abilitiesCivilPlane() {
        return "Кол-во мест: " + numberOfPassengers + ". Наличие бизнес класса: " + businessClass;
    }

    public void passengers(int passengers) {
        if (passengers < numberOfPassengers && passengers >= 0) {
            numberOfPassengers -= passengers;
            System.out.println(passengers + " мест занято, свободных мест осталось: " + numberOfPassengers);
        } else if (passengers == numberOfPassengers) {
            numberOfPassengers -= passengers;
            System.out.println("Самолет загружен");
        } else System.out.println("Нехватает пасадочных мест");
    }

    @Override
    public void description() {
        super.description();
        System.out.println(abilitiesCivilPlane());
    }
}
