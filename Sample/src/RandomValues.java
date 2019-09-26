import java.util.Random;

public class RandomValues {

    public static void main(String[] args) {

        Random r = new Random();
        int n = r.nextInt(100);  // Or (int) Math.random()*100
        int k = r.nextInt(50);
        int p = r.nextInt(70);
        int t = r.nextInt(90);
        System.out.println(n);
        System.out.println(k);
        System.out.println(p);
        System.out.println(t);
    }
}
