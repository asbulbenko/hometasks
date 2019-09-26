package oop.polymorphism;

public class Cat extends Pets {
    public void specialVoice() {
        System.out.println("Мяу-мур");
    }

    @Override
    public void sniff() {
        System.out.println("Нюх-нюх");
    }
}
