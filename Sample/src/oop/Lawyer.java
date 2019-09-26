package oop;

public class Lawyer extends Employee{

    // Класс адвокат будет иметь метод договариваться
    // также его зарплата будет выше на 100%
    // а также сможет делать репорты к CEO
    public Lawyer(int i, String n, long y) {
        super(i, n, y);
    }

    public Lawyer() {
        super(3, "Kolomiec Lev Andreich", 1980);
        setSalary( getSalary() * 2);
    }

    void deal(){
        System.out.println("Lawyer can accept or decline deals!");
    }

    void reportToCeo(){
        report();
    }
}
