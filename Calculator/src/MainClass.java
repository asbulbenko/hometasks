import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args){
        double number1,number2;

        Scanner in = new Scanner(System.in);

        try {
            // input number1 from console
            System.out.println("Input first number");
            number1 = in.nextDouble();

            // input number2 from console
            System.out.println("Input second number");
             number2 = in.nextDouble();

        // input operation
        System.out.println("Input operation symbol +, -, *, / or %");

        switch (in.next().charAt(0)){
            case '+':
                System.out.println("Addition result = " + (number1 + number2));
                break;
            case '-':
                System.out.println("Subtraction result = " + (number1 - number2));
                break;
            case '*':
                System.out.println("Multiplication result = " + (number1 * number2));
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("You cannot divide by zero");
                } else
                    System.out.println("Divide result = " + (number1 / number2));
                break;
            case '%':
                System.out.println("Module result = " + (number1 % number2));
                break;
            default:
                System.out.println("Incorrect symbol");
        }
        } catch (InputMismatchException e){
            System.out.println("You entered incorrect data for number");
        } catch (Exception e){
            System.out.println("Exception occurred");
        }
        System.out.println("Please run program again");

        // close console input
        in.close();
    }
}
