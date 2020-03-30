package day57;

import org.w3c.dom.ls.LSOutput;

public class TryCatch {
    public static void main(String[] args) {

        System.out.println("Hello fresh!");
        try {
            int result = 10 / 2;
        } catch (ArithmeticException e) { // e it's a variable
            System.out.println("Exception happened ");

        }
        System.out.println("After try Catch");
    }

}
