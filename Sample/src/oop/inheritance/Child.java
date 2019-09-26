package oop.inheritance;

public class Child extends Parent {
    final private int KOEF = 10;

    private int sub_data1;
    private int sub_data2;
    private int sub_data3;



    public Child(int data1, int data2, int data3) {
        super(data1, data2, data3);
        this.sub_data1 = data1;
        this.sub_data2 = data2;
        this.sub_data3 = data3;
    }

    public Child(int data1) {
        super(data1);
        this.sub_data1 = data1;
    }

    public Child(){
        sub_data1 = 1;
        sub_data2 = 2;
        sub_data3 = 3;
    }


    public int getSub_data1() {
        return sub_data1;
    }

    public int getSub_data2() {
        return sub_data2;
    }

    public int getSub_data3() {
        return sub_data3;
    }

    protected int doAltCalc() {
        return KOEF * (sub_data1 + sub_data2 + sub_data3);
    }
}
