package repl;

import java.util.Scanner;

public class Repl22 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);


        System.out.println("Enter Item1 and its price:");
        Double item1 = scan.nextDouble();
        Double price1 = scan.nextDouble();
        System.out.println("Total price:" + item1 * price1);

        System.out.println("Enter Item2 and its price:");
        Double item2 = scan.nextDouble();
       Double price2 = scan.nextDouble();
        System.out.println("Total price:"+ item2 * price2);

        System.out.println("Enter Item3 and its price:");
        Double item3 = scan.nextDouble();
        Double price3 = scan.nextDouble();
        System.out.println("Total price:"+ item3 * price3);







    }
}

