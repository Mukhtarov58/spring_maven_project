package org.example.chat.server;

import com.google.gson.Gson;

public class PersonSerialization {
    // Сериализация объекта Person в JSON
    public static String serializePersonToJson(Person person) {
        Gson gson = new Gson();
        return gson.toJson(person);
    }

    // Десериализация JSON в объект Person
    public static Person deserializeJsonToPerson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Person.class);
    }
}

