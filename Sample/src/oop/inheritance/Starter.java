package oop.inheritance;

public class Starter {
    public static void main(String[] args) {
        Child child1 = new Child();
        System.out.println(child1.doCalc());

        Child child2 = new Child(5);
        System.out.println(child2.doCalc());

        Child child3 = new Child(10, 10, 10);
        System.out.println(child3.doCalc());
        System.out.println(child3.doAltCalc());
    }
}
