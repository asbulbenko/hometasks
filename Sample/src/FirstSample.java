import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Date;
import java.util.Scanner;

public class FirstSample {

    public static void main(String[] args) {
        // for(initialization; condition; step)
//        int operand =100;
//        for (int i = -5; i <= 5; i++) {
//
//            // if was introduced in for loop just to avoid dividing by zero
//            // когда i становиться 0 и попадает в if
//            // мы с помощью continue проскакиваем выполнение следущего действия
//            if (i==0){
//                continue;
//            }
//
//            double res = operand / i;
//            System.out.println(res);
//        }

        //---------------------//

//        int i = 1;
//        while(i<10){
//            System.out.println(i);
//            i++;
//        }

//        do{
//            System.out.println("sadas");
//        }while(false);

        //-------------------//

//        for (int i = 0; i < 20; i++) {
//
//        int rand = (int) (Math.random() * 10 + 1);
//
//        switch (rand){
//            case 1:
//                System.out.println("Random number is equal: 1");
//                break;
//            case 5:
//                System.out.println("Random number is equal: 5");
//                break;
//            case 10:
//                System.out.println("Random number is equal: 10");
//                break;
////            default:
////                System.out.println("Another number");
//        }
//
//        }


        // Postfix увеличение i произошло после того как переменной j присвоился i
        // поэтому j будет равно 100, а i увеличиться и будет равно 101

        int i = 100;
        int j = i++;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        final double CM_PER_INCH = 2.54; // constant variable, you cannot changed it later. Value assigned once.

        double height = 8.2; //inch values
        double weight = 9.2; //inch values

        System.out.println("Height cm results " + height*CM_PER_INCH + " " + "Weight cm results " + weight*CM_PER_INCH);

        // Math method

        int x = 4;
        double y = Math.pow(3,3);
        System.out.println(y);  // значение в степени
        System.out.println("Square root math result " + Math.sqrt(x));


        // String concatenation
        // It's Better use StringBuilder than concatenate with '+' sign

        StringBuilder builder = new StringBuilder();
        builder.append(27);
        builder.append("SNS");
        builder.append('$');
        String completedString = builder.toString();
        System.out.println(completedString);

        Scanner in = new Scanner(System.in);
        System.out.println("What is your name? Please type it in console and press Enter");
        String name = in.nextLine();
        System.out.println("What is your age?");
        int age = in.nextInt();
        System.out.println("Hi " + name + "! " + "In next year you will be " + (age+1) + "!");
        System.out.printf("Hi %s! Next year you will be %d! ", name, age+1);
        System.out.println("");
        System.out.printf("%tc", new Date());
        System.out.println("");


        //something new
        // if (condition) statement
        // if (condition) statement1 else statement2
        // while (condition) statement
        // do statement while (condition);

        int yourSales = 14000;
        int target = 15000;
        int bonus;
        String performance;

        if(yourSales >= 2*target){
            performance = "Excellent";
            bonus = 1000;
            System.out.printf("Thanks for work, your performance is %s, so your annual bonus %d", performance, bonus);
        }else if(yourSales >= 1.5*target){
            performance = "Fine";
            bonus = 500;
            System.out.printf("Thanks for work, your performance is %s, so your annual bonus %d", performance, bonus);
        }else if(yourSales>=target){
            performance = "Good";
            bonus = 100;
            System.out.printf("Thanks for work, your performance is %s, so your annual bonus %d", performance, bonus);
        }else {
            System.out.println("You are fired!");
        }


        // array

        int[] a = new int[5];

        for (int k = 0; k < a.length; k++) {
            a[k]=k;
            System.out.println(a[k]);
        }

        String[] autors = {"James King", "Leo Tolstoy", "J.K. Rowling"};
        System.out.println("Intersting autors " + autors[2] + " and " + autors[1]);


        // for each loop
        // for (variable : collection) statement

        for (int element : a)  //Y ou should read this loop as “for each element in a”
            System.out.println(element);




    }
}
