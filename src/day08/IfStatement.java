package day08;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int speedLimit = 60 ;

        int yourCurrentSpeed = 45 ;

        boolean iAmSpeeding = ( yourCurrentSpeed > speedLimit ) ;

        if ( iAmSpeeding ) {
            System.out.println( " Get pulled over by the police " ) ;
            System.out.println( " Given ticket by the police " ) ;
            System.out.println( " Taken away some points on your license " ) ;
            System.out.println( " Go to Court " ) ;
        } else {
            System.out.println( " Go shopping " );
            System.out.println( " Buy Ice cream " );
            System.out.println( " Enjoy your day " );

        }
        System.out.println( " The End " );


    }
}
