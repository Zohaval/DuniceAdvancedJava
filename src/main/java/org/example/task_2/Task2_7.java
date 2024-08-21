package org.example.task_2;

import static org.example.Main.scanner;

public class Task2_7 {
    public static void validateString() {
        System.out.println("Провалидировать строку на закрывающиеся скобки (написать метод)");
        System.out.print("\nВведите строку: ");
        String str = scanner.next();
        int countBracketOpen = str.length() - str.replace(String.valueOf('('), "").length();
        int countBracketClosed = str.length() - str.replace(String.valueOf(')'), "").length();
        if (countBracketOpen != countBracketClosed){
            System.out.println("не провалидировано");
            return;
        }
        int countFiguredBracketOpen = str.length() - str.replace(String.valueOf('{'), "").length();
        int countFiguredBracketClosed = str.length() - str.replace(String.valueOf('}'), "").length();
        if (countFiguredBracketOpen != countFiguredBracketClosed){
            System.out.println("не провалидировано");
            return;
        }
        int countSquareBracketOpen = str.length() - str.replace(String.valueOf('['), "").length();
        int countSquareBracketClosed = str.length() - str.replace(String.valueOf(']'), "").length();
        if (countSquareBracketOpen != countSquareBracketClosed){
            System.out.println("не провалидировано");
            return;
        }
        System.out.println("Строка провалидирована");
    }
}
