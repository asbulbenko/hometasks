import java.lang.reflect.Array;
import java.util.Arrays;

public class ReversiveArray {

    public static void main(String[] args) {

        int[] arr = {3,2,1,9,16,5,32};
        System.out.println(Arrays.toString(arr));

        // Поменять местами значения в массиве
        for (int i = 0, j= arr.length-1; i < arr.length / 2; i++, j--) {
            swap(arr, i, j);
        }
        System.out.println(Arrays.toString(arr));
    }


    private static void swap(int[] array, int leftIndex, int rightIndex) {
        int tmp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = tmp;
    }
}
