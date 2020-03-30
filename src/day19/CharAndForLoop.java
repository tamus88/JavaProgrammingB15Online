package day19;

public class CharAndForLoop {

    public static void main(String[] args) {

//        int x = 'A' ;


//        System.out.println(x);
//        char myChar = 101; // e
        char myChar = 'A';
        System.out.println(myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);

//        System.out.println('A' > 'B');


        for ( char iChar = 'A'; iChar<='Z'; iChar++ ){

            System.out.print(iChar + " " );

        }
        System.out.println();

        for(char kChar = 'Z'; kChar >= 'A'; kChar--){

            System.out.print(kChar + " " );

        }


    }
}
