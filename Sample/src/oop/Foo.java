package oop;

public class Foo {

    private int i = 0;

    public int getI() {
        return i;
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        System.out.println(foo.hashCode());
    }
}
