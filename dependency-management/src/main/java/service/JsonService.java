package service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Game;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonService {

    Gson gson;
    private final String JSON_NAME = "games.json";

    public JsonService(){
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public String convertToJson(List<Game> games){
        return gson.toJson(games);
    }

    public void saveJson(String json) {
        try (FileWriter writer = new FileWriter(JSON_NAME)) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
