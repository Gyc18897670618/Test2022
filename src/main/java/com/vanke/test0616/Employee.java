package com.vanke.test0616;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee implements Comparable<Employee> {
    private static final long serialVersionUID = 1;

    public String name2;
    private String name;
    private double salary;
    private LocalDate hireDay;


    @Override
    public int compareTo(Employee object) {
        return Double.compare(salary,object.salary);
    }
}

