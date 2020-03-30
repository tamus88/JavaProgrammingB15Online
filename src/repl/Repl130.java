package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl130 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        //int[] nums = new int[size];
       int[]nums ={6,2,5,3};
      //  for(int i = 0; i < size; i++) {
          //  nums[i] = scan.nextInt();

            //WRITE YOUR CODE HERE
            nums[0] = nums[1];
            nums[1] = nums[2];
            nums[2] = nums[3];
            nums[3] = nums[0];
            System.out.println("nums = " + Arrays.toString(nums));
        }

    }


