package repl;

public class Repl188 {

    public static void main(String[] args) {

//        In this task, you need to write 2 methods findMax() that will find a maximum number in the array.
//        First method should work with array of integers (int[]) and return int, and second method should
//        work with an array of doubles (double[]) and return double as a result.
//        Methods must have the same name and different parameters.
//                Fo more information:  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
//
//        Comment: Methods should be non static and with a return type.
       int[]nums = {22,44,55,70};
        System.out.println(findMax(nums));
    double[] nums1 ={99.99,15.99,25};
        System.out.println(findMax(nums1));
      removeFirst("Toma");

    }
    public static int findMax(int[]nums){
        int max = 0;
        for (int x = 0; x < nums.length; x++) {
            if(nums[x]>max){
               max=nums[x];
            }

        }
        return max;

    }

    public static double findMax(double[]nums){
        double max = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                max=nums[i];
            }
        }
    return max;

    }
    public static String removeFirst(String target) {

        System.out.println(target.substring(1));

        return target;
    }
}


