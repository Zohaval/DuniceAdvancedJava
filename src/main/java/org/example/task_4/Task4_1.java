package org.example.task_4;

import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Task4_1 {
    public static void filtration() {
        System.out.println("1. Используя метод forEach и лямбда функции, вывести получившихся сотрудников в консоль");
        MainTask4.list
                .forEach(person -> System.out.println(person));
        System.out.println("\n2. Вывести всех сотрудников у которых зарплата выше 100 000 тыс");
        MainTask4.list.stream()
                .filter(person -> person.salary > 100000)
                .forEach(System.out::println);
        System.out.println("\n3. Вывести сотрудника у которого максимальная зарплата");
        Person maxSalary = MainTask4.list.stream()
                .max(Comparator.naturalOrder()).get();
        System.out.println(maxSalary);
        System.out.println("\n4. Сгруппировать по имени сотрудников");
        MainTask4.list.stream()
                .collect(Collectors.groupingBy(e->e.getName()))
                .values()
                .forEach(System.out::println);
        System.out.println("\n5. Вывести сумму зарплат, всех сотрудников");
        int allSalary = MainTask4.list.stream()
                .mapToInt(Person::getSalary)
                .sum();
        System.out.println(allSalary);
        System.out.println("\n6. Вывести среднюю зарплату сотрудников");
        OptionalDouble averageSalary = MainTask4.list.stream()
                .mapToInt(Person::getSalary)
                .average();
        System.out.println(averageSalary.orElse(0));
    }
}
