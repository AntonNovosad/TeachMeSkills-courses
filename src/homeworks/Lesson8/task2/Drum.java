package homeworks.Lesson8.task2;

public class Drum implements MusicalInstrument{
    private int numberOfCymbals;

    public Drum(int numberOfCymbals) {
        this.numberOfCymbals = numberOfCymbals;
    }

    public Drum() {
    }

    public int getNumberOfCymbals() {
        return numberOfCymbals;
    }

    public void setNumberOfCymbals(int numberOfCymbals) {
        this.numberOfCymbals = numberOfCymbals;
    }

    @Override
    public void play(String nameSong) {
        System.out.println("исполняет " + nameSong + " на барабанах с тарелками в количестве " + numberOfCymbals + " шт");
    }
}
