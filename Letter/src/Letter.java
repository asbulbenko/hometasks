public class Letter {

    public static void main(String[] args) {

        // How to draw a letter with console using * char

//        System.out.println("* * * * * * * *");
//        System.out.println("* *         * *");
//        System.out.println("*   *     *   *");
//        System.out.println("*      *      *");
//        System.out.println("*   *     *   *");
//        System.out.println("* *         * *");
//        System.out.println("* * * * * * * *");

        char star = '*';
        int i =0;

        while (i < 8){
            System.out.print(star + " ");
            System.out.println(star + " " + star + " ");
            i++;
        }


    }
}
