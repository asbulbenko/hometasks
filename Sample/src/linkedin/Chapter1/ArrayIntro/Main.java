package linkedin.Chapter1.ArrayIntro;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 31, 45, 22, 98, 10
        int[] numbers = new int[5];
        int[] number2 = {31, 45, 22, 98, 10};

        // same getting statements
        System.out.println("index 2: " + number2[2]);
        System.out.println("index 2: " + Array.get(number2, 2));

        // to sort arrays we can use method from Arrays class
        Arrays.sort(number2);
        System.out.println(Arrays.toString(number2));
    }
}
