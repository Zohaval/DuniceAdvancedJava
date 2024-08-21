package org.example.task_2;

import static org.example.Main.scanner;

public class Task2_3 {
    public static void countingNumberTwo() {
        System.out.println("Напишите метод, который будет подсчитывать количество цифр «2», \nиспользуемых в десятичной записи целых чисел от 0 до n (включительно)");
        System.out.print("\nВведите n: ");
        int n = scanner.nextInt();
        String str = "";
        for (int i = 0; i <= n; i++) {
            str += Integer.toString(i);
        }
        char ch = '2';
        int count = str.length() - str.replace(String.valueOf(ch), "").length();
        System.out.println("Количество цифр «2»: " + count);
    }
}
