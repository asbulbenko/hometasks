public class TestRandom {

    public static void main(String[] args) {
        int[] arr1= {1,2,3};
        getChangeVal(arr1);
        System.out.println(arr1[2]);
    }

    private static void getChangeVal(int[] arr) {
        arr[2]=100;
        System.out.println(arr[2]);
    }
}
