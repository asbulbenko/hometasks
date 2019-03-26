public class MathLibArr {


    public static int[] addArr(int[] a, int[] b){
        if(a.length != b.length){
            System.out.println("Your arrays have different length!");
            System.exit(-1);
        }

        int[] result = new int[b.length];
        for (int i = 0; i <= b.length-1 ; i++) {
            result[i] = a[i] + b[i];
        }
        return result;
    }

    public static int[] subArr(int[] a, int[] b){
        if(a.length != b.length){
            System.out.println("Your arrays have different length!");
            System.exit(-1);
        }

        int[] result = new int[b.length];
        for (int i = 0; i <= b.length-1 ; i++) {
            result[i] = a[i] - b[i];
        }
        return result;
    }

    public static int[] mulArr(int[] a, int[] b){
        if(a.length != b.length){
            System.out.println("Your arrays have different length!");
            System.exit(-1);
        }

        int[] result = new int[b.length];
        for (int i = 0; i < b.length ; i++) {
            result[i] = a[i] * b[i];
        }
        return result;
    }

    public static int[] divArr(int[] a, int[] b){
        if(a.length != b.length){
            System.out.println("Bullshit");
            System.exit(-1);
        }

        int[] result = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            result[i] = a[i] / b[i];
        }
        return result;
    }

    public static void showArr(int[] arr) {

        for(int el:arr){
            System.out.print(el + "; ");
        }
        System.out.println();
    }
}
