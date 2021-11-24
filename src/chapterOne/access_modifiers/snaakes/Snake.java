package chapterOne.access_modifiers.snaakes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Snake{

    HashMap<String, Integer> player = new HashMap<>();
    List<String> players = new ArrayList<>();
    int play = 0;

    public void setPlayers(List<String> players) {
        this.players = players;
    }

    public List<String> getPlayers() {
        return players;
    }

    public void addPlayers(String player) {
        this.players.add(player);
    }
}
