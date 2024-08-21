package org.example;

import org.example.task_1.MainAnimals;
import org.example.task_2.MainTask2;
import org.example.task_3.MainTask3;
import org.example.task_4.MainTask4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("""
                        \n1. Задача 1
                        2. Задача 2
                        3. Задача 3
                        4. Задача 4
                        5. Выйти""");
                switch (scanner.nextInt()) {
                    case 1:
                        MainAnimals.start();
                        break;
                    case 2:
                        MainTask2.start();
                        break;
                    case 3:
                        MainTask3.start();
                        break;
                    case 4:
                        MainTask4.start();
                        break;
                    case 5:
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
