package Practicing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice2 {
    public static void main(String[] args) {

      int num = 0;
       while(num<=50){

        if(num%2==0){
            System.out.println(num);
        }
        num++;
        }

        int[] nums = {1,3,4,5,6};
        System.out.println(firstLast6(nums));
    }

    public static boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length-1] == 6) {
            return true;
        } else {
            return false;
        }
    }
}