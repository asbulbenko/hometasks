public class CalcArray {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {5,6,7};

        int[] result = new int[arr1.length];

        String arg = args[0];
        MathLibArr.showArr(arr1);
        MathLibArr.showArr(arr2);

        switch (arg){
            case "add":
                result = MathLibArr.addArr(arr1,arr2);
                break;
            case "sub":
                result = MathLibArr.subArr(arr1,arr2);
                break;
            case "mul":
                result = MathLibArr.mulArr(arr1,arr2);
                break;
            case "div":
                result = MathLibArr.divArr(arr1,arr2);
                break;
            default:
                System.out.println("You must specify: 'add' or 'sub' or 'mul' or 'div' arguments" );
                System.exit(-1);
                break;
        }
        MathLibArr.showArr(result);

    }
}
