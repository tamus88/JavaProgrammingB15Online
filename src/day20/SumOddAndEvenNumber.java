package day20;

public class SumOddAndEvenNumber {

    public static void main(String[] args) {

        int sumOfOdd = 0;
        int sumOfEven = 0;

        for (int x = 10; x < 100 ; x++) {
            if(x%2==0){
                sumOfEven = sumOfEven+x;
            }else if(x%2==1){

                sumOfOdd = sumOfOdd+x;
            }

        }
        System.out.println(sumOfEven + " Even ");
        System.out.println(sumOfOdd + " Odd ");












    }
}
