package main.java;

import java.time.LocalDate;

public class Employee {

    // instance fields
    // three instance fields that will hold the data manipulated inside an instance of the Employee class
    private String name;
    private Double salary;
    private LocalDate hireDay;

    // constructor
    public Employee(String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    // methods
    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public Double getRaiseSalaryBy(int r){
        return salary+=((r*salary)/100);
    }
}
