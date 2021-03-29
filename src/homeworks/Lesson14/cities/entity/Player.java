package homeworks.Lesson14.cities.entity;

import homeworks.Lesson14.cities.config.NumberOfPlayer;

public class Player {
    private String name;
    private NumberOfPlayer numberOfPlayer;

    public Player(String name, NumberOfPlayer numberOfPlayer) {
        this.name = name;
        this.numberOfPlayer = numberOfPlayer;
    }

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NumberOfPlayer getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public void setNumberOfPlayer(NumberOfPlayer numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", name, numberOfPlayer.getValue());
    }
}
