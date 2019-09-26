import java.util.Arrays;

public class FibonachiTest {
    public static void main(String[] args) {

        // Найти сумму всех чисел факториала от 10
        int[] fib = new int[10];

        fib[0]=1;
        fib[1]=1;
        int sum = fib[0] + fib[1];

        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i-1] + fib[i-2];
            sum = sum + fib[i];
        }
        System.out.println(Arrays.toString(fib));
        System.out.println("Summarize of fibonachi n10:" + sum);

        // более красивое решение
        /*
        int sumFibonachi = 0;
        int numbers[] = new int[10];

        for (int i = 0; i< numbers.length; i++) {
            if(i==0 || i==1){
                numbers[i] = 1;
            } else {
                numbers[i] = numbers[i-1] + numbers[i-2];
            }
            sumFibonachi += numbers[i];
         }
         System.out.println("Summarize of fibonachi n10:" + sumFibonachi);
         */


    }
}
