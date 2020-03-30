package day12;

public class CheckingStringEqualityWithoutCase {

    public static void main(String[] args) {

        String userName = "abc123";

        boolean userNameCorrect = userName.equals("ABC123");
        System.out.println( userNameCorrect);


        boolean userNameCorrect2 = userName.equalsIgnoreCase("ABC123");

        System.out.println( userNameCorrect2 );

        String name = "Guvanch";
        boolean myName = name.equals("guvanch");
        System.out.println(myName);
        boolean name2 = name.equalsIgnoreCase("guvanch");
        System.out.println(name2);



























    }
}
