import java.util.Scanner;

public class MainClass {

    public static void main(String[] args){
        int number1,number2,summ;

        Scanner in = new Scanner(System.in);

        // input number1 from console
        System.out.println("Input first number");
        number1 = in.nextInt();

        // input number2 from console
        System.out.println("Input second number");
        number2 = in.nextInt();

        // input operation
        System.out.println("Input operation symbol +, -, *, / or %");

        switch (in.next().charAt(0)){
            case '+':
                System.out.println("Addition result = " + (number1+number2));
                break;
            case '-':
                System.out.println("Subtraction result = " + (number1-number2));
                break;
            case '*':
                System.out.println("Multiplication result = " + (number1*number2));
                break;
            case '/':
                System.out.println("Devide result = " + (number1/number2));
                break;
            case '%':
                System.out.println("Module result = " + (number1%number2));
                break;
            default:
                System.out.println("Incorrect symbol");
        }

        // close console input
        in.close();
    }
}
