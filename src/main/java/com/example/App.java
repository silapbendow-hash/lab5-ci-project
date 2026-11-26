package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Приложение запущено. Начинаем работу.");

        Gson gson = new Gson();
        Map<String, String> data = new HashMap<>();
        data.put("status", "success");
        data.put("message", "Сборка прошла успешно");
        data.put("version", "1.0.0");

        String json = gson.toJson(data);
        System.out.println("Результат в формате JSON: " + json);

        logger.info("Приложение завершило работу корректно.");
    }
}