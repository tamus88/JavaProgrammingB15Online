package day17;

public class SkipCounting {

    public static void main(String[] args) {

        int counter = 0 ;

        while (counter < 30){
            // counter = counter +3 ;
            counter += 3 ;
            System.out.print(counter + " ");

        }
        System.out.println();

        int evenNumber = 0;
        while(evenNumber < 50){
            evenNumber +=2 ;
            System.out.print(evenNumber + " ");
        }
        System.out.println();
        int oddNumber = 1;
        while(oddNumber < 50){

            System.out.print(oddNumber + " ");
            oddNumber +=2 ;
        }

        System.out.println();

        int cnt3 = 0;
        while ( cnt3 <= 50 ){
            if(cnt3 % 2 == 0){
            System.out.println(cnt3+ " is even number");
        }else{
            System.out.println(cnt3 + " is Odd number");
        }
            ++cnt3;






        }










    }
}
