import java.util.Random;

public class RandomValues {

    public static void main(String[] args) {

        Random r = new Random();
        int n = r.nextInt(100);  // Or (int) Math.random()*100
        System.out.println(n);
    }
}
