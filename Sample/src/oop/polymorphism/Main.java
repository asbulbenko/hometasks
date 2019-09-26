package oop.polymorphism;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Pets pet = new Pets();

        pet.sniff();
        cat.sniff();
    }
}
