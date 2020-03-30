package day14;

public class StringReview {

    public static void main(String[] args) {

//        String str = "I like Pumpkin";
//
//        System.out.println("str = " + str);
//        System.out.println("Does it contains Pumpkin : ");
//
//        System.out.println(  str.contains("Pumpkin")                   );
//
//        boolean gotPumpkin = str.contains("Pumpkin") ;
//
//        System.out.println("gotPumpkin = " + gotPumpkin);
//
//        boolean startedWithI = str.startsWith("I") ;
//        System.out.println("startedWithI = " + startedWithI);
//
//        boolean endWithPumpkin = str.endsWith("Pumpkin");
//        System.out.println("endWithPumpkin = " + endWithPumpkin);

        //  PASSWORD VALIDATOR

        // MINIMUM 8 CHAR MAX 16 CHAR
        // IT MUST CONTAINS _ OR $
        // IT MUST NOT CONTAINS SPACE
        // IT MUST START Ab

        // if any of above condition does not match say INVALID PASSWORD
        // else say  GOOD PASSWORD !
        String password = "AS_H2723gfgdsu";
        // MINIMUM 8 CHAR MAX 16 CHAR
        boolean min8max16 = password.length() >= 8 && password.length() <= 16;

        // IT MUST CONTAINS _ OR $
        boolean mustContains_or$ = password.contains("_") || password.contains("$");
        //

        // IT MUST NOT CONTAINS SPACE
        boolean mustNotContainsSpace = !password.contains(" ");
        //

        // IT MUST START Ab
        boolean mustStartsWithAb = password.startsWith("Ab");
        //

        if (min8max16 && mustContains_or$ && mustNotContainsSpace && mustStartsWithAb) {
            System.out.println("VALID PASSWORD");
        } else {
            System.out.println("INVALID PASSWORD");


        }
    }
}