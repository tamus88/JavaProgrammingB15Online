package repl;

import java.util.Scanner;

public class Repl_124 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO: write your code below
        for(int x = nums.length - 1; x>=0;x--){
            System.out.print(nums[x]+",");
        }

    }








    //Do not change below statement:
    // System.out.println(Arrays.toString(nums));
}
