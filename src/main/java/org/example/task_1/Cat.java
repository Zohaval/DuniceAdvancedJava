package org.example.task_1;

public class Cat extends Animals {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }
}
