package homeworks.Lesson7.task1;

public class Air extends Transport {
    private int wingspan; //размах крыльев
    private int minimumRunway;

    public Air(String model, int power, int maxSpeed, int mass, int wingspan, int minimumRunway) {
        super(model, power, maxSpeed, mass);
        this.wingspan = wingspan;
        this.minimumRunway = minimumRunway;
    }

    public Air() {
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinimumRunway() {
        return minimumRunway;
    }

    public void setMinimumRunway(int minimumRunway) {
        this.minimumRunway = minimumRunway;
    }

    private String abilitiesAir() {
        return "Размах крыльев: " + getWingspan() + ". Минимальная дальность(км): " + getMinimumRunway();
    }

    @Override
    public void descriptionAir() {
        super.descriptionAir();
        System.out.println(abilitiesAir());
    }
}
