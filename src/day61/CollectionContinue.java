package day61;

import java.util.*;

public class CollectionContinue {
    public static void main(String[] args) {

        Collection<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,6,4,7,8,9));
        System.out.println("nums = " + nums);

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(10,7,4,11,67,8));
       Collections.sort(nums2);
        System.out.println("nums2 = " + nums2);

    }


}
