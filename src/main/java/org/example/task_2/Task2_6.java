package org.example.task_2;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.example.Main.scanner;

public class Task2_6 {
    public static void repeatingCharacter() {
        System.out.println("Найти ПЕРВЫЙ наиболее часто повторяющийся в строке символ (написать метод)");
        System.out.print("\nВведите строку: ");
        String str = scanner.next();
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char i : str.toCharArray()) {
            charCount.put(i, charCount.getOrDefault(i, 0) + 1);
        }
        char character = '\0';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            char currentChar = entry.getKey();
            int currentCount = entry.getValue();
            if (currentCount > maxCount) {
                character = currentChar;
                maxCount = currentCount;
            }
        }
        System.out.println("ПЕРВЫЙ наиболее часто повторяющийся в строке символ" + character);
    }
}
