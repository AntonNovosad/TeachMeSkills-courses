package homeworks.Lesson7.task1;

public class WarPlane extends Air {
    private boolean ejectionSystem;
    private int numberOfRocket;

    public WarPlane(String model, int power, int maxSpeed, int mass, int wingspan, int minimumRunway, boolean ejectionSystem, int numberOfRocket) {
        super(model, power, maxSpeed, mass, wingspan, minimumRunway);
        this.ejectionSystem = ejectionSystem;
        this.numberOfRocket = numberOfRocket;
    }

    public WarPlane() {
    }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }

    public int getNumberOfRocket() {
        return numberOfRocket;
    }

    public void setNumberOfRocket(int numberOfRocket) {
        this.numberOfRocket = numberOfRocket;
    }

    @Override
    public void useRocket() {
        numberOfRocket--;
        if (numberOfRocket >= 0) {
            System.out.println("Запуск ракеты. Ракет осталось: " + numberOfRocket);
        } else System.out.println("Ракеты закончились");
    }

    @Override
    public void ejections() {
        if (ejectionSystem) {
            System.out.println("Катапультирование прошло успешно");
            ejectionSystem = !ejectionSystem;
        } else System.out.println("Ошибка. Катапультирование невозможно.");
    }


    private String abilitiesWarPlane() {
        return "Наличие системы катапультирования: " + ejectionSystem + ". Количество ракет: " + numberOfRocket;
    }

    @Override
    public void descriptionAir() {
        super.descriptionAir();
        System.out.println(abilitiesWarPlane());
    }
}
