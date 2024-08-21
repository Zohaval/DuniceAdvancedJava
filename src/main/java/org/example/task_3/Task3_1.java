package org.example.task_3;

import java.util.List;

public class Task3_1 {
    public static void distributionPeople() {
        List<Students> array = List.of(new Students("Вася", 21, Sex.MAN), new Students("Tolik", 18, Sex.MAN), new Students("gena", 50, Sex.MAN), new Students("Vera", 33, Sex.WOMEN));
        System.out.println("Призывники:");
        array.stream()
                .filter(x -> x.getSex() == Sex.MAN && x.getAge() >= 18 && x.getAge() <= 27)
                .forEach(System.out::println);
        System.out.println("Работяги:");
        array.stream()
                .filter(w -> w.getAge() >= 18 && (w.getSex() == Sex.WOMEN && w.getAge() <= 55) ||
                        (w.getSex() == Sex.MAN && w.getAge() <= 60))
                .forEach(System.out::println);
    }
}
