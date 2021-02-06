package homeworks.Lesson7.task2;

public class ManualGearBox extends GearBox {
    public ManualGearBox(int numberOfGears) {
        super(numberOfGears);
    }

    public ManualGearBox() {
    }

    public void gearBox() {
        System.out.println("Переключаю на 1-ю передачу из " + getNumberOfGears());
    }
}
