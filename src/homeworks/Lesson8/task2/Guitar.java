package homeworks.Lesson8.task2;

public class Guitar implements MusicalInstrument{
    private int numberOfStrings;
    private String typeOfGuitar;

    public Guitar(int numberOfStrings, String typeOfGuitar) {
        this.numberOfStrings = numberOfStrings;
        this.typeOfGuitar = typeOfGuitar;
    }

    public Guitar() {
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String getTypeOfGuitar() {
        return typeOfGuitar;
    }

    public void setTypeOfGuitar(String typeOfGuitar) {
        this.typeOfGuitar = typeOfGuitar;
    }

    @Override
    public void play(String nameSong) {
        System.out.println("исполняет " + nameSong + " на гитаре с " + numberOfStrings + " струнами, типа " + typeOfGuitar);
    }
}

