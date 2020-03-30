package day16;

public class IndexOfWith2Parameters {

    public static void main(String[] args) {
//                     012345678901234567890123456789012
        String name = "I love Java I Love Java Java Java";

        System.out.println("Java starting from 0 " + name.indexOf("Java"));
        System.out.println("Java starting from 7 " + name.indexOf("Java", 7));
        System.out.println("Java starting from 8 " + name.indexOf("Java", 8));
        System.out.println("Java starting from 9 " + name.indexOf("Java", 9));
        System.out.println("Java starting from 19 " + name.indexOf("Java", 19));
        System.out.println("Java starting from 20 " + name.indexOf("Java", 20));

        int firstJavaLocation = name.indexOf("Java");
        int startingPointToSearchSecondJava = firstJavaLocation +1 ;
        int secondJavaLocation = name.indexOf("Java" , startingPointToSearchSecondJava);
        System.out.println("secondJavaLocation = " + secondJavaLocation);




    }
}
