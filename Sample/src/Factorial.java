public class Factorial {

    public static void main(String[] args) {

        int n = 3;
        System.out.println("Factorial is :"
                + fact(n));
    }
    // Factorial of 3! = 1*2*3 = 6

    // execution of this method by steps
    // 1 step n=3 , result = 3 * (fact2)                           ^
    // 2 step n=2 , result = 2 * (fact1)                           |
    // 3 step n=1, if n==1 then fact1 will return 1                |
    // so execution of recursive method will be from end to start  |
    private static long fact(int n) {
        long result;
        if (n == 1){
            return 1;
        }

        result = n * fact(n-1);
        return result;
    }
}
