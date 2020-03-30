package repl;
import java.util.*;
public class Repl124 {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

            //TODO: write your code below
            int count = nums.length;
            int lastIndex = count - 1;
            int lastNums = nums[lastIndex];
            for (int eachnums : nums) {

                System.out.print(nums);
                // only print arrow when the fruit is not last item
                for (int x = 0; x < nums.length-1; x--) {

                }
                if (!nums.equals(lastNums)) {
                    System.out.print(" -->  ");


                    //Do not change below statement:
                    System.out.println(Arrays.toString(nums));

                }
            }
        }

        }