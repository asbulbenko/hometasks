public class TernarTest {
    public static void main(String[] args) {

        double d1 = Math.random();
        double d2 = Math.random();

        System.out.println(getDoAction(d1, d2));

        System.out.println(getDoThis(d1, d2));
    }

    private static String meth1(){
        return "d1 >= d2";
    }

    private static String meth2(){
        return "d1 < d2";
    }

    private static String getDoThis(double d1, double d2) {
        return(d1<d2 ? "d1 lower than d2" : "d1 bigger or equal than d2");
    }

    private static String getDoAction(double d1, double d2) {
        return (d1>=d2 ? meth1() : meth2());
    }
}
