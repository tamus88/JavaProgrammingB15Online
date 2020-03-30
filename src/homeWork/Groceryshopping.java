package homeWork;
 import java.util. Scanner;
public class Groceryshopping {

    public static void main(String[] args) {
        Scanner scan = new Scanner ( System.in);


        System.out.println( "How much is tomato ? :");
        double priceOftomato = scan.nextDouble();

        System.out.println( " How many tomatos do you want ? :");
        double countOftomato = scan.nextDouble();

        System.out.println(" Your total for tomato is :" + priceOftomato * countOftomato );

        System.out.println( " How much is banana ? :");
        double priceOfbanana = scan.nextDouble ();
        System.out.println(" How many bananas do you want? :");
        double countOfbanana = scan.nextDouble();
        System.out.println( " your total for banana's is :" + priceOfbanana * countOfbanana + "$ " );


    }






}
