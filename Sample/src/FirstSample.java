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

    }
}
