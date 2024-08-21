package org.example.task_2;

import static org.example.Main.scanner;

public class Task2_5 {
    public static void compressionString() {
        System.out.println("Реализуйте метод сжатия строки на основе счетчика повторяющихся символов. \n" +
                "Например, строка aabcccccaaa должна превратиться в а2b1с5аЗ. \n" +
                "Если «сжатая» строка оказывается длиннее исходной, метод должен вернуть исходную строку");
        System.out.print("\nВведите строку: ");
        String str = scanner.next();
        String newStr = "";
        char[] charArray = str.toCharArray();
        int counter = 1;
        for (int i = 0; i < charArray.length; i++) {
            if (i + 1 < charArray.length && charArray[i] == charArray[i + 1]) {
                counter++;
            } else {
                newStr = newStr + charArray[i] + Integer.valueOf(counter);
                counter = 1;
            }
        }
        if (str.length() > newStr.length()) {
            System.out.println(newStr);
        }
        else {
            System.out.println(str);
        }
    }
}
