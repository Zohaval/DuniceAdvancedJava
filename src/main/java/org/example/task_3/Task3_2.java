package org.example.task_3;

import java.util.List;

public class Task3_2 {
    public static void redactionCollection() {
        List<String> list = List.of("a1", "a4", "a3", "a2", "a1", "a4");
        list.stream().sorted().forEach(x -> System.out.print(x + " "));
        System.out.println();
        list.stream().map(x -> x + "_1").forEach(x -> System.out.print(x + " "));
        System.out.println();
        list.stream().map(x -> x.substring(1)).forEach(x -> System.out.print(x + " "));
        System.out.println();
        list.stream().distinct().sorted().forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
