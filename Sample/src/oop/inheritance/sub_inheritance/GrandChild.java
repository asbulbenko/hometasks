package oop.inheritance.sub_inheritance;

import oop.inheritance.Child;

public class GrandChild extends Child {
    public int doAltCalc() {
        int result = super.doAltCalc();
        return result;
    }
}
