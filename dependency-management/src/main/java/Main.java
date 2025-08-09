import model.Game;
import service.JsonService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        JsonService jsonService = new JsonService();

        Game game1 = Game.builder().name("Grand Theft Auto V").genre("Action").build();
        Game game2 = Game.builder().name("Crimson Desert").genre("RPG").build();

        List<Game> games = new ArrayList<>();

        games.add(game1);
        games.add(game2);

        String json = jsonService.convertToJson(games);

        System.out.println(json);
        jsonService.saveJson(json);

    }
}

