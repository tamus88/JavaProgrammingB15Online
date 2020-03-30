package day11;

public class StringEqualityPractice {

    public static void main(String[] args) {

        System.out.println( " Java ".equals("java")    );

        String myStr = "Java";

        System.out.println(   myStr.equals("Java")    );

        String yourStr = new String ("Java");

        System.out.println(  " is my string same as your string ? "       );
        System.out.println( myStr.equals(yourStr) );

        if ( myStr .equals("Java")){
            System.out.println(" Correct Word !!!!! ");
        }else{
            System.out.println("Say Java !!!!! ");
        }





    }
}
