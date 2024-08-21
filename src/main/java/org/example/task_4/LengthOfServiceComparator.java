package org.example.task_4;

import java.util.Comparator;

public class LengthOfServiceComparator implements Comparator<Person> {

    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.lengthOfService, p2.lengthOfService);
    }
}
