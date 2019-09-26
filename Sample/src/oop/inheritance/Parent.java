package oop.inheritance;

public class Parent {

    private int data1;
    private int data2;
    private int data3;

    public Parent(){
        this.data1 = 100;
        this.data2 = 200;
        this.data3 = 300;
    }

    public Parent(int data1, int data2, int data3){
       this.data1 = data1;
       this.data2 = data2;
       this.data3 = data3;
    }

    public Parent(int data1) {
        this.data1 = data1;
        this.data2 = 10;
        this.data3 = 20;
    }

    public int doCalc(){
        int result = power(data1) + power(data2) + power(data3);
        return result;
    }

    // возведение в квадрат
    private int power(int a) {
        return a * a;
    }

    public int getData1(){
        return data1;
    }

    public int getData2() {
        return data2;
    }
}
