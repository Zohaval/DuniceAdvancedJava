package org.example.task_2;

import java.util.ArrayList;
import java.util.HashSet;

import static org.example.Main.scanner;

public class Task2_1 {

    public static void removingDuplicates() {
        ArrayList<Integer> listNumbers = new ArrayList<>();
        System.out.println("Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.\n");
        System.out.println("Впишите 5 чисел");
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            listNumbers.add(num);
        }
        HashSet<Integer> uniqueNumbers = new HashSet<>(listNumbers);
        System.out.print("Созданная коллекция: ");
        for (int i = 0; i < listNumbers.size(); i++) {
            System.out.print(listNumbers.get(i) + " ");
        }
        System.out.print("\nКоллеккция без дубликатов: " + uniqueNumbers + "\n");
    }
}
