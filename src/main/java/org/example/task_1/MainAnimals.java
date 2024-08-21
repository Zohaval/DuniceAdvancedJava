package org.example.task_1;

public class MainAnimals {
    public static void start() {
        System.out.println("Создать несколько животных и объединить их общие поля/методы в один класс, \nот которого они будут наследоваться, продемонстрировать действие полиморфизма\n");
        Cat cat = new Cat("Рыжик");
        Parrot parrot = new Parrot("Кеша");
        cat.makeSound();
        parrot.makeSound();
        cat.movement();
        parrot.movement();
        System.out.println(cat.getName());
    }
}
