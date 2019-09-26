package oop.inheritance.sub_inheritance;

public class Starter2 {
    public static void main(String[] args) {
        // чтобы вызвать метод протектед из Child
        // нам необходимо создать еще один класс GrandChild где мы унаследуем все методы
        // но мы можем его использовать только внутри grandChild

        GrandChild grandChild = new GrandChild();
        System.out.println(grandChild.doAltCalc());
    }
}
