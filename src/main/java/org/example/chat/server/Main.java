package org.example.chat.server;

public class Main {
    /**
     * Домашнее задание
     * Условие:
     * Создать проект с использованием Maven или Gradle, добавить в него несколько зависимостей и написать код,
     * использующий эти зависимости.
     * Пример решения:
     * 1. Создайте новый Maven или Gradle проект, через Intellj IDEA.
     * 2. Добавьте зависимости org.apache.commons:commons-lang3:3.14.0 и com.google.code.gson:gson:2.10.1.
     * 3. Создайте класс Person с полями firstName, lastName и age.
     * 4. Используйте библиотеку commons-lang3 для генерации методов toString, equals и hashCode.
     * 5. Используйте библиотеку gson для сериализации и десериализации объектов класса Person в формат JSON.
     */
    public static void main(String[] args) {

        // Создание объекта Person
        Person person1 = new Person("Ivan", "Petrov", 30);
        Person person2 = new Person("Ivan", "Petrov", 25);
        Person person3 = new Person("Ivan", "Petrov", 30);
        Person person4 = new Person("Ivan", "Petrov", 45);


        // Сериализация объекта в JSON
        String json = PersonSerialization.serializePersonToJson(person4);
        System.out.println("Сериализованный объект Person в JSON: " + json);

        // Десериализация JSON в объект Person
        String jsonInput = "{\"firstName\":\"Ivan\",\"lastName\":\"Petrov\",\"age\":25}";
        Person deserializedPerson = PersonSerialization.deserializeJsonToPerson(jsonInput);
        System.out.println("Десериализованный JSON в объект Person: " + deserializedPerson);

        // Проверка равенства объектов
        System.out.println("person1.equals(person2): " + person1.equals(person2));
        System.out.println("person1.equals(person3): " + person1.equals(person3));

        // Хэш-коды объектов
        System.out.println("HashCode person1: " + person1.hashCode());
        System.out.println("HashCode person2: " + person2.hashCode());
        System.out.println("HashCode person3: " + person3.hashCode());


        // Вывод информации с помощью переопределенного метода  toString(), в формате JSON_STYLE
        System.out.println("String representation of person1: " + person1);
        System.out.println("String representation of person2: " + person2);
        System.out.println("String representation of person3: " + person3);


    }
}
