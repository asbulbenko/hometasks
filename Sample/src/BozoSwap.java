import java.util.Arrays;

public class BozoSwap {

    public static void main(String[] args) {

        int[] array = {10, 3, 5, 23, 8, 6, 1};
        System.out.println(Arrays.toString(array));
        boolean sorted = false;

        // пока не отсортировано
        while(!sorted) {

            // вибираем два рандомных индекса
            int index1 = Randomize(array.length);
            int index2 = Randomize(array.length);

            // и меняем их местами
            int tmp = array[index1];
            array[index1] = array[index2];
            array[index2] = tmp;

            // проверяем удалось ли отсортировать
            sorted = true;
            for (int i = 1; i < array.length; i++) {
                if(array[i] < array[i-1]){
                    sorted = false;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(array));

    }

    private static int Randomize(int length) {
        double result = Math.random();
        return (int) (result * length);
    }
}
