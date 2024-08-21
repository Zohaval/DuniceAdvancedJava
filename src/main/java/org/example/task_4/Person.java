package org.example.task_4;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person>{
    public String name;
    public int salary;
    public int age;
    public int lengthOfService;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", lengthOfService=" + lengthOfService +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        return this.salary - person.salary;
    }
}
