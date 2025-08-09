package service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Game;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonService {

    Gson gson;

    public JsonService(){
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public String convertToJson(List<Game> games){
        return gson.toJson(games);
    }

    public void saveJson(String json) {
        try (FileWriter writer = new FileWriter("games.json")) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
