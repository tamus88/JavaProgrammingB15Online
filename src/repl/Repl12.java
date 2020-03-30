package repl;

import java.util.Scanner;

public class Repl12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:");
        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune");

        String a =s.next();

        if (a==a) {
            System.out.println("a is wrong");

     //   }else if (b==b) {
            System.out.println("b is correct");
    //    }else if(c==c) {
          System.out.println("c is wrong");
         } else {
          System.out.println("z is not a valid answer");


                }
//        what is the farthest planet in the solar system:
//        a)venus
//        b)pluto
//        c)neptune
//                a
//        a is wrong
//
//        what is the farthest planet in the solar system:
//        a)venus
//        b)pluto
//        c)neptune
//                b
//        b is correct
//
//        what is the farthest planet in the solar system:
//        a)venus
//        b)pluto
//        c)neptune
//                c
//        c is wrong
//
//        what is the farthest planet in the solar system:
//        a)venus
//        b)pluto
//        c)neptune
//                z
//        z is not a valid answer
            }

        }

