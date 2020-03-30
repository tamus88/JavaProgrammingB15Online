package day13;

public class StringMethods {

    public static void main(String[] args) {

//        String s1 = "Hello";
//        System.out.println( s1.equals("abc"));
//        System.out.println( s1.equalsIgnoreCase("Hello"));
//
//
//        System.out.println(    s1           );
//        System.out.println(   s1.toUpperCase()              );
//        System.out.println(    s1.toLowerCase()     );

        String name = "Googa";
        System.out.println(name.equals("Chanel"));
        System.out.println(name.equalsIgnoreCase("googa"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(  name.length()     );

        int lengthOfStr = name.length() ;

        if(lengthOfStr>4){
            System.out.println("More than 4 character");
        }else{
            System.out.println("Not more than 4 ");
        }




    }
}
