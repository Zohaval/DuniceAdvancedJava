package org.example.task_3;

import java.util.InputMismatchException;

import static org.example.Main.scanner;

public class MainTask3 {

    public static void start() {
        while (true) {
            try {
                System.out.println("""
                        \n1. Подзадача 3.1
                        2. Подзадача 3.2
                        3. Выйти""");
                switch (scanner.nextInt()) {
                    case 1:
                        Task3_1.distributionPeople();
                        break;
                    case 2:
                        Task3_2.redactionCollection();
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
