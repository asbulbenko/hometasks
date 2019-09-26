package linkedin.Chapter1.OrelReshka;

import java.util.Random;

public class Coin {

    private static final int Orel = 0;
    private static final int Reshka = 1;

    private int sideOfCoin;

    // Changed our constructor to not accept any parameters
    // so instead of parameter it will execute a flip method

//    public Coin(int start) {
//        sideOfCoin = start;
//    }

    public Coin() {
        flip();
    }

    // Method will flip the coin and check what the side of the coin is displayed

    public void flip() {
        Random rand = new Random();
        sideOfCoin = rand.nextInt(2);
    }

    public String getSideOfCoin() {
        if(sideOfCoin == Orel) {
            return ("OREL");
        } else if(sideOfCoin == Reshka) {
            return ("RESHKA");
        } else
            return ("Ivalid");
    }

}
