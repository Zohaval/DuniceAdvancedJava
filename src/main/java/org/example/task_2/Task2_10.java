package org.example.task_2;

public class Task2_10 {
    public static void isiIdentical() {
        System.out.println("Дан массив целых чисел nums. Пара (i,j) называется идентичной, если nums[i] == nums[j] и i < j.\n" +
                "Необходимо вычислить количество идентичных пар, реализовав следующий метод на java:");
        System.out.println("Массив {4,1,2,4,4,2}");
        int[] myArray = new int[]{4, 1, 2, 4, 4, 2};
        System.out.print("Пары: ");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i; j < myArray.length; j++) {
                if (i < j && myArray[i] == myArray[j]) {
                    System.out.printf("(%d %d) ", i, j);
                }
            }
        }
        System.out.println();
    }
}
