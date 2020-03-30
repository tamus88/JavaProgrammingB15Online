package homeWork;

import java.util.Arrays;

public class WarmUp {

    public static void main(String[] args) {


        int[] numbers = new int[100];

        for (int i = 1; i <=100 ; i++) {
            numbers[i-1]= i;
        }
        System.out.println(Arrays.toString(numbers));

        for (int each : numbers) {
            if(each%2==0){
                //continue;
                System.out.print(each + " ");
            }


        }



    }

}
