package homeworks.Lesson8.task2;

import org.w3c.dom.ls.LSOutput;

public class Trumpet implements MusicalInstrument {
    private int numberOfKeys;
    private String typeTrumpet;

    public Trumpet(int numberOfKeys, String typeTrumpet) {
        this.numberOfKeys = numberOfKeys;
        this.typeTrumpet = typeTrumpet;
    }

    public Trumpet() {
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public String getTypeTrumpet() {
        return typeTrumpet;
    }

    public void setTypeTrumpet(String typeTrumpet) {
        this.typeTrumpet = typeTrumpet;
    }

    @Override
    public void play(String nameSong) {
        System.out.println("исполняет " + nameSong + " на трубе модели " + typeTrumpet);
    }
}
