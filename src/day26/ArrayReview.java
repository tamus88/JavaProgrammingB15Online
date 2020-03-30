package day26;

public class ArrayReview {

    public static void main(String[] args) {

        int[] myNumbers = new int[4];

        myNumbers[0]  = 10 ;
        myNumbers[1]  = 40 ;
        myNumbers[2]  = 30 ;
        myNumbers[3]  = 7 ;

        //myNumbers[2] = myNumbers[2]+myNumbers[0];
        myNumbers[2] = myNumbers[2]+myNumbers[1];
        System.out.println(myNumbers[2]);

        myNumbers[0]=myNumbers[0]-3;
        myNumbers[3]=myNumbers[3]+3;
        System.out.println(myNumbers[0]);
        System.out.println(myNumbers[3]);

    }
}
