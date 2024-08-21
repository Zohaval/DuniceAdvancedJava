package org.example.task_2;

import static org.example.Main.scanner;

public class Task2_8 {
    public static void addBracket() {
        System.out.println("Дана строка, содержащая только английские буквы (большие и маленькие).\n" +
                "Добавить открывающиеся и закрывающиеся скобки по следующему образцу: \n" +
                "\"example\" -> \"(e(x(a(m)p)l)e)\" (написать метод)");
        System.out.print("\nВведите строку: ");
        String str = scanner.next();
        StringBuilder newStr = new StringBuilder();
        String bracketOpen = "(";
        String bracketClosed = ")";
        char[] charArray = str.toCharArray();
        for (int i = 0; i < (charArray.length + 1) / 2; i++) {
            newStr.append(bracketOpen).append(charArray[i]);
        }
        if (charArray.length % 2 == 0) {
            newStr.append(bracketOpen).append(bracketClosed);
        }
        else {
            newStr.append(bracketClosed);
        }
        for (int i = (charArray.length + 1) / 2; i < charArray.length; i++) {
            newStr.append(charArray[i]).append(bracketClosed);
        }
        System.out.println("Результат: " + newStr);
    }
}
