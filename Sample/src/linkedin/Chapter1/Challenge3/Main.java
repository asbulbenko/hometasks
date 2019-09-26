package linkedin.Chapter1.Challenge3;

import java.util.Scanner;

public class Main {

    // Create a dice roll program, where the user ca roll the dice
    // and the program will output the value of that dice
    // Assume that user should input roll to start rolling dices
    // and user has two dices, so 2 values should be printed

    public static void main(String[] args) {
        System.out.println("Do you want to start rolling the dices (y/N)?");
        Scanner sc = new Scanner(System.in);

        if (sc.next().contains("y")) {
            System.out.println("Dice rolling starting");
            Dice d1 = new Dice();
            Dice d2 = new Dice();
//            System.out.println("D1 " + d1.faceUpOfDice);
//            System.out.println("D2 " + d2.faceUpOfDice);
        System.out.println(d1.getFaceUpOfDice());
        System.out.println(d2.getFaceUpOfDice());
        } else
            System.out.println("Try your luck next time!");







    }
}
