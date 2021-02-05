package homeworks.Lesson7.task2;

public class AutomaticGearBox extends GearBox {
    private char nameOfGear;

    public AutomaticGearBox(int numberOfGears, char nameOfGear) {
        super(numberOfGears);
        this.nameOfGear = nameOfGear;
    }

    public AutomaticGearBox() {
    }

    public char getNameOfGear() {
        return nameOfGear;
    }

    public void setNameOfGear(char nameOfGear) {
        this.nameOfGear = nameOfGear;
    }

    public void choiceOfGear(){
        System.out.println("Выбран режим передачи: " + nameOfGear);
    }
}
