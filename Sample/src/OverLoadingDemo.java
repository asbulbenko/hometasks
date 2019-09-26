public class OverLoadingDemo {

    public static int add (int n1, int n2){
        return n1 + n2;
    }

    // task was decided to be change by manager
    // so manager want to addition of double values
    // but do not change the name of method 'add'

    public static double add (double n1, double n2){
        return n1 + n2;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 10));
        System.out.println(add(5.0, 10.0));
    }
}
