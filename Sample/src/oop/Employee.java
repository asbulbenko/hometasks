package oop;

import java.util.Calendar;
import java.util.Random;

public class Employee {

    private int id;
    private String name = "Unknown";
    private long year;
    private long salary = 100;
    private boolean vacation = false;
    private boolean fired = false;
    final private long bonusSalary = 100;



    public Employee(int i, String n, long y){
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public Employee(long y, String n) {
        this(new Random().nextInt(100), n, y);
    }

    public Employee(){
    }

    public int getId() {
        return id;
    }

    // Решили что наш сотрудник будет делать репорт
    // А другие классы будут наследовать его
    void report() {
        System.out.println("I've done it successfully");
    }

    // чтобы использвовать salary в других классах которые наследуют Employee
    // нам необходимо создать отдельный метод где будет этот salary использоваться
    // тогда классы потомки смогут перевызвать этот метод и изменить его как им нужно
    // напрямую salary вызывать нельзя так как мы закрыли его спецификатором доступа private

    long getSalary(){
        return salary;
    }

    // создаем setSalary для того чтобы его потом можно было вызвать и изменить

    void setSalary(long salary) {
        this.salary = salary + bonusSalary;
    }

    boolean getFired() {
        return fired;
    }

    void setFired() {
        fired = true;
    }

    boolean getVacation() {
        return vacation;
    }

    void setVacation(boolean statusVacation) {
        vacation = statusVacation;
    }



    // Приватные методы можно исрользовать только внутри этих классов
    // их нельзя вызвать из другого класса например из main
//    private void showName(){
//        System.out.println("Empl's FIO: " + name);
//    }
//
//    public void showFullName(){
//        System.out.println("Id #: " + id);
//        showName();
//    }

}
