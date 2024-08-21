package org.example.task_1;

public class Parrot extends Animals {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Чик-чирик!");
    }

    @Override
    public void movement() {
        System.out.println("Метит");
    }
}
