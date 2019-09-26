import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

        int[] array = {10, 3, 5, 23, 8, 6, 1};
        System.out.println(Arrays.toString(array));
        boolean needIteration = true;                 // вводим переменную чтобы делать столько проходов в цикле for сколько потребуется

        while (needIteration) {                       // итерируемся в while пока не решим что итераций больше не нужно
            needIteration = false;                    // перед каждой итерацией мы допускаем что массив отсортирован и проганяем через цикл for
            for (int i = 1; i < array.length; i++) {  // если нет, то применяем getSwap метод и возвращаем переменную обратно в true
                if (array[i] < array[i - 1]) {        // начинаем с i=1 чтобы отсечь массивы с 1 элементом на входе
                    getSwap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void getSwap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
