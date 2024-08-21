package org.example.task_4;

public class Task4_2 {
    public static void comparePerson() {
        SalaryComparator salaryCompare = new SalaryComparator();
        AgeComparator ageCompare = new AgeComparator();
        LengthOfServiceComparator lengthOfServiceCompare = new LengthOfServiceComparator();
        System.out.println("\nСравнение по зарплате");
        MainTask4.list.stream()
                .sorted(salaryCompare)
                .forEach(System.out::println);
        System.out.println("\nСравнение по возрасту");
        MainTask4.list.stream()
                .sorted(ageCompare)
                .forEach(System.out::println);
        System.out.println("\nСравнение по выслуге лет");
        MainTask4.list.stream()
                .sorted(lengthOfServiceCompare)
                .forEach(System.out::println);
    }
}
