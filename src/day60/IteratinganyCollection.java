package day60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratinganyCollection {
    public static void main(String[] args) {

        Collection<Integer> nums = new ArrayList<>(Arrays.asList(10, 4, 5, 33, 22));

        Iterator<Integer> myIter = nums.iterator();
        while (myIter.hasNext()) {
            // System.out.println("myIter = " + myIter.next());
            if (myIter.next() <= 10) {
                myIter.remove();
            }
        }
        System.out.println("nums = " + nums);
//        System.out.println(myIter.hasNext());
//        System.out.println(myIter.next());
//        System.out.println(myIter.next());
//        System.out.println(myIter.next());
//        System.out.println(myIter.next());
//        myIter.remove();
//
//        System.out.println(myIter.next());
//        System.out.println(myIter.hasNext());
//        System.out.println("nums = " + nums);

//        int[] numbers = {2,5,8,9,4};
//        for (int i =numbers.length-1; i>=0; i--) {
//            System.out.print(numbers[i]);

//    String name = "Hello";
//        for (int i = 0; i< name.length()-2; i++) {
//            System.out.println(name.charAt(i));
//        }
//        String a = "last";
//         String b = "chars";
//        System.out.println(a.charAt(0)+""+b.charAt(b.length()-1));
//       b.isEmpty();
        //        int lst = a.charAt(0) + b.length()-1;
//        System.out.println("lst = " + lst);

        String str = "red apple";
        String str2 = "blue fish";
        String color = "red";
        String empty = "";
        if(str.startsWith("red")&&str2.startsWith("blue")){
           color+=str;
        }
        System.out.println("color = " + color);


    }




    }






