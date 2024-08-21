package org.example.task_2;

import java.util.InputMismatchException;

import static org.example.Main.scanner;

public class MainTask2 {

    public static void start() {
        while (true) {
            try {
                System.out.println("""
                        \n1. Подзадача 2.1
                        2. Подзадача 2.2
                        3. Подзадача 2.3
                        4. Подзадача 2.4
                        5. Подзадача 2.5
                        6. Подзадача 2.6
                        7. Подзадача 2.7
                        8. Подзадача 2.8
                        9. Подзадача 2.9
                        10. Подзадача 2.10
                        0. Выйти""");
                switch (scanner.nextInt()) {
                    case 1:
                        Task2_1.removingDuplicates();
                        break;
                    case 2:
                        Task2_2.outputArray();
                        break;
                    case 3:
                        Task2_3.countingNumberTwo();
                        break;
                    case 4:
                        Task2_4.isStringPermutation();
                        break;
                    case 5:
                        Task2_5.compressionString();
                        break;
                    case 6:
                        Task2_6.repeatingCharacter();
                        break;
                    case 7:
                        Task2_7.validateString();
                        break;
                    case 8:
                        Task2_8.addBracket();
                        break;
                    case 9:
                        Task2_9.converterSpace();
                        break;
                    case 10:
                        Task2_10.isiIdentical();
                        break;
                    case 0:
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
