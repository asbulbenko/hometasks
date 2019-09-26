package linkedin.Chapter1.OrelReshka;

public class Main {
    public static void main(String[] args) {

        // Write a program that will flip the coin
        // and will print what side of the coin is displayed
        // Add a method that will repeatedly flip the coin

        Coin c = new Coin();
        System.out.println(c.getSideOfCoin());

        for (int i = 0; i < 10 ; i++) {
            c.flip();
            System.out.println(c.getSideOfCoin());
        }

    }
}
