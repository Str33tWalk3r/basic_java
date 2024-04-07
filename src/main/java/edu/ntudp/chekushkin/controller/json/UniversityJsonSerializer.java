package edu.ntudp.chekushkin.controller.json;

import com.google.gson.Gson;
import edu.ntudp.chekushkin.model.University;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UniversityJsonSerializer {
    public static void writeToFile(Object object, String filePath) {
        Gson gson = new Gson();
        String json = gson.toJson(object);

        try {
            var writer = new FileWriter(filePath);
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static University readFromFile(String filePath) {
        Gson gson = new Gson();

        try {
            return gson.fromJson(new FileReader(filePath), University.class);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
