package homeworks.Lesson14.cities.entity;

import homeworks.Lesson14.cities.config.NumberOfPlayer;
import homeworks.Lesson14.cities.create.CreatePlayers;
import homeworks.Lesson14.cities.util.Input;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Game {
    private Queue<Player> players;
    private AddNameCities addNameCities = new AddNameCities();

    public Game() {
        players = createPlayers();
    }

    public void start() {
        System.out.println("Игра началась");
        run();
    }

    private Queue<Player> createPlayers() {
        return new ArrayDeque<>(Arrays.asList(
                CreatePlayers.createPlayer(NumberOfPlayer.ONE),
                CreatePlayers.createPlayer(NumberOfPlayer.TWO)
        ));
    }

    private void run() {
        while (true) {
            Player activePlayer = players.poll();
            String city = makeMove(activePlayer);
            if (city.equalsIgnoreCase("Сдаюсь")) {
                System.out.println(String.format("%s победил!", players.poll()));
                break;
            }
            players.offer(activePlayer);
        }
    }

    private String makeMove(Player player) {
        System.out.printf("Ход игрока %s \n", player);
        String city = Input.getString();
        return addNameCities.addNameCities(city);
    }
}
