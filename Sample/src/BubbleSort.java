import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {

        // генерируем массив из случайных елементов
        int[] array = generateArray();
        System.out.println(Arrays.toString(array));

        int n = array.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n-i) ; j++) {
                if(array[j-1] > array[j]){
                    int tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                }

            }

        }
        System.out.println(Arrays.toString(array));
    }

    private static int[] generateArray() {

        // массив размером в 5 элементов
        int[] array = new int[5];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
        }

        return array;
    }
}
