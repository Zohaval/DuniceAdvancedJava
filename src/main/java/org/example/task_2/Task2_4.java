package org.example.task_2;

import java.util.Arrays;

import static org.example.Main.scanner;

public class Task2_4 {
    public static void isStringPermutation() {
        System.out.println("Реализуйте метод, определяющий, является ли одна строка перестановкой другой.\n" +
                "Под перестановкой понимаем любое изменение порядка символов. Регистр учитывается, пробелы являются существенными.");
        scanner.useDelimiter("\\n");
        System.out.print("\nВедите первую строку: ");
        String str1 = scanner.next();
        System.out.print("Ведите вторую строку: ");
        String str2 = scanner.next();
        if (str1.length() != str2.length()) {
            System.out.println("\n1 строка не является перестановкой 2");
            return;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] != charArray2[i]) {
                System.out.println("\n1 строка не является перестановкой 2");
                return;
            }
        }
        System.out.println("\n1 строка является перестановкой 2");
    }
}
