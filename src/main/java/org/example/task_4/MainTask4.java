package org.example.task_4;

import java.util.InputMismatchException;
import java.util.TreeSet;

import static org.example.Main.scanner;

public class MainTask4 {

    public static TreeSet<Person> list = new TreeSet<>();

    public static void start() {
        list.add(new Person("Гена",80000, 34, 3));
        list.add(new Person("Гена",90000, 30, 5));
        list.add(new Person("Валерий", 120000, 42, 15));
        list.add(new Person("Евгения", 105000, 32, 7));
        while (true) {
            try {
                System.out.println("""
                        \n1. Подзадача 4.1
                        2. Подзадача 4.2
                        3. Выйти""");
                switch (scanner.nextInt()) {
                    case 1:
                        Task4_1.filtration();
                        break;
                    case 2:
                        Task4_2.comparePerson();
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("\nНекорректный ввод");
                }
            } catch (InputMismatchException ex) {
                System.out.println("\nНекорректный ввод");
                scanner.next();
            }
        }
    }
}
