package day06;

public class PreIncrementDecrementOperator {

    public static void main(String[] args) {

        int offerCount = 2;

        //offerCount +=1;
        ++offerCount;

        System.out.println("Offer Now after increasing by one " + offerCount);
        offerCount -=4;

        //--offerCount;

        System.out.println("Offer Now after decreasing by one " + offerCount);


    }
}
