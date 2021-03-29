package homeworks.Lesson14.cities.create;

import homeworks.Lesson14.cities.config.NumberOfPlayer;
import homeworks.Lesson14.cities.entity.Player;
import homeworks.Lesson14.cities.util.Input;

public class CreatePlayers {
    public static Player createPlayer(NumberOfPlayer numberOfPlayer) {
        String name = Input.getString(String.format("Введите имя для %s", numberOfPlayer.getValue()));
        return new Player(name, numberOfPlayer);
    }
}
