package org.example.task_2;

import static org.example.Main.scanner;

public class Task2_9 {
    public static void converterSpace() {
        System.out.println("Дана строка, Вам требуется преобразовать все идущие подряд пробелы в один (написать метод).");
        System.out.print("\nВведите строку: ");
        scanner.useDelimiter("\\n");
        String str = scanner.next();
        StringBuilder newStr = new StringBuilder();
        String[] words = str.split(" ");
        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            newStr.append(word).append(" ");
        }
        System.out.println("Результат: " + newStr);
    }
}
