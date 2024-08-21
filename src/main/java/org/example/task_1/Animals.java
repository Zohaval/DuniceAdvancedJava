package org.example.task_1;

import lombok.Data;

@Data
public class Animals {
    private final String name;

    public Animals(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Какой-то звук");
    }

    public void movement() {
        System.out.println("Движение");
    }
}
