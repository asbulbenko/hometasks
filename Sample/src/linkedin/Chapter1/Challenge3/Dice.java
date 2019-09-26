package linkedin.Chapter1.Challenge3;

import java.util.Random;

public class Dice {


    public int faceUpOfDice;

    public Dice() {
        faceUpOfDice = roll();
    }

    private int roll() {
        Random r = new Random();
        faceUpOfDice = r.nextInt(7);
        while (faceUpOfDice ==0){
            faceUpOfDice = r.nextInt(7);
        }
        return faceUpOfDice;
    }

    public String getFaceUpOfDice() {
        if(faceUpOfDice == 1) {
            return "ONE";
        } else if(faceUpOfDice == 2){
            return "TWO";
        } else if(faceUpOfDice == 3){
            return "THREE";
        } else if(faceUpOfDice == 4){
            return "FOUR";
        } else if(faceUpOfDice == 5){
            return "FIVE";
        } else
            return "SIX";
    }

//    public int sideOfDice1;
//    public int sideOfDice2;
//
//    public Dice() {
//        roll();
//    }
//
//    private void roll() {
//        Random r = new Random();
//        sideOfDice1 = r.nextInt(7);
//        sideOfDice2 = r.nextInt(7);
//    }

//    public String getSideOfDice(int sideOfDice) {
//        if(sideOfDice == 1) {
//            return "ONE";
//        } else if(sideOfDice == 2){
//            return "TWO";
//        } else if(sideOfDice == 3){
//            return "THREE";
//        } else if(sideOfDice == 4){
//            return "FOUR";
//        } else if(sideOfDice == 5){
//            return "FIVE";
//        } else if (sideOfDice == 6){
//            return "SIX";
//        } else
//            return "Invalid";
//    }

}
