package main.java;

import java.time.LocalDate;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee[] staff = new Employee[3];
        staff[0] = new Employee("David Bimmer", 1000, 2015, 10, 2);
        staff[1] = new Employee("Tony Tester", 900, 2016, 1, 25);
        staff[2] = new Employee("Brad Smith", 1200, 2015, 2, 14);

        Employee harry = new Employee("Clay Tompson", 500, 2018,  12, 2 );

        // Raise salary for employees by percentage

        for(Employee e: staff){
//            if ((LocalDate.now().getYear() - e.getHireDay().getYear()) > 3)
            e.getRaiseSalaryBy(5);
        }

        // Print employees with new salary

        for (Employee e:staff){
            System.out.println("Name=" + e.getName() + " New Salary=" + e.getSalary() + " Hire Day=" + e.getHireDay());
        }
    }
}
