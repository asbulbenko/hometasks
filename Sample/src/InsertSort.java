import java.util.Arrays;
import java.util.Random;

public class InsertSort {

    public static void main(String[] args) {

//        int[] arr = {4,8,1,3,5};
        // создаем рэндомно 5 элементов массива
        Random r = new Random();
        int[] arr = new int[]{r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100)};
        System.out.println(Arrays.toString(arr));

        // сортировка методом вставок
        for (int i = 1; i < arr.length; i++) {  // выбирается второй эелемент массива
            for (int j = 0; j < i; j++) {       // выбирается первый эелемент массива
//            for (int j = i-1; j >= 0; j--) {
                if (arr[i] < arr[j]) {            // они сравниваются и если второй меньше первого то меняем местами
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
//                    i--;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

