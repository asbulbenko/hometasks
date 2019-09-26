package oop;

public class Manager extends Employee{


    // для того чтобы использовать возможности из класса employee (поля и методы)
    // мы должны создать конструктор (control + Enter)
    // а также использовать слово super
    // super означает означает обращение к конструктору родительского класса
    public Manager() {
        super(2, "Ivanov Pert Ivanovich", 2000);
        //изменяем зарплату на 25% для менеджера
        setSalary((long) (getSalary() * 1.25));
    }

    public Manager(int i, String n, long y) {
        super(i, n, y);
    }

    // Класс manager будет иметь метод уволить
    void fire (int id) {
        System.out.println("The employee with ID" + id + "is fired");
    }

    // этот метод будет иметь возможность вызывать report() от родителя так как мы наследовались от класса Employee
    void reportToCeo(){
        report();
    }



}
