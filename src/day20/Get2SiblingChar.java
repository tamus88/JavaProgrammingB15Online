package day20;

public class Get2SiblingChar {

    public static void main(String[] args) {


//        int lastCharIndex = charCount-1;


//        System.out.println(name.substring(2, 4));
//        System.out.println(name.substring(4, 6));
//        System.out.println(name.substring(6, 8));

//        int x = 0 ;
//        System.out.println(name.substring(x,x + 2));
//        x=x+2;
//        System.out.println(name.substring(x,x + 2));
//        x=x+2;
//        System.out.println(name.substring(x,x + 2));
//        x=x+2;
//        System.out.println(name.substring(x,x + 2));

        String name = "Arya";
        int charCount = name.length();

        for(int x = 0 ; x<=charCount-3 ; x++){

            System.out.println(name.substring(x,x + 3));

        }


    }
}



















