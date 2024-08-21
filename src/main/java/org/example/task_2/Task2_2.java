package org.example.task_2;

import static org.example.Main.scanner;

public class Task2_2 {
    public static void outputArray() {
        System.out.println("Написать метод итератор по массиву\n");
        System.out.println("Заполните числами массив: ");
        int[] myArray = new int[5];
        for (int i = 0; i < 5; i++) {
            myArray[i] = scanner.nextInt();
        }
        System.out.print("Введённый массив: ");
        for (int i : myArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
