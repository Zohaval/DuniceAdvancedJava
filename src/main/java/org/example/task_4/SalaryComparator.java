package org.example.task_4;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Person> {

    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.salary, p2.salary);
    }
}
