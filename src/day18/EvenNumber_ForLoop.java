package day18;

public class EvenNumber_ForLoop {

    public static void main(String[] args) {


        for( int even = 0 ; even<=100; even+=2){ // or even = even + 2

            System.out.println(even + " Even Numbers ");
        }

        for (int x= 0 ; x<100 ; x+=3){

            System.out.print( x+ " ");
        }


        for (int i = 0; i < 100 ; i++) {

            if (i % 2 ==0) {
                System.out.println(i + " ");
            }

        }

        for (int i = 0; i <100 ; i++) {
            if( i % 5==0 && i %3==0){
                System.out.println(i+ " FizzBuzz Number");
            }
        }




    }
}
