import java.util.Scanner;

public class MinValue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please populate array with double values");

        double[] array = new double[] {in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble()};

        double minElement;
        minElement = array[0];

        for (int i = 1; i < array.length ; i++) {
            if (minElement > array[i])
                minElement=array[i];
        }
        System.out.println("Minimal double value in array " + minElement);
    }
}
