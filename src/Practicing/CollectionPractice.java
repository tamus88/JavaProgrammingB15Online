package Practicing;
import java.util.*;
public class CollectionPractice {
    public static void main(String[] args) {

        //Common Collection interface methods
        Collection<Integer> coll = new ArrayList<>();
        coll.add(3);
        coll.add(30);
        coll.add(13);
        System.out.println(coll);

        // adding multiple items in a one shot
        coll.addAll(Arrays.asList(3, 4, 6, 7, 9, 88));
        System.out.println("coll = " + coll);
        // getting size
        System.out.println("coll.size() : " + coll.size());
        //checking empty or not
        System.out.println("coll.isEmpty : " + coll.isEmpty());
        //remove Item
        System.out.println("coll.remove(7) = " + coll.remove(7));
        System.out.println(coll);
        //contains item
        System.out.println("coll.contains(7) : " + coll.contains(7));
        //contains All items
        System.out.println("coll.containsAll(Arrays.asList(3,4,6)) : " + coll.containsAll(Arrays.asList(3, 4, 6)));

         //remove All
        coll.removeAll(Arrays.asList(3, 4, 6));
        System.out.println(coll);
         //retains All
        coll.retainAll(Arrays.asList(30, 13, 88));
        System.out.println(coll);
        //removeIf
        coll.removeIf(each -> each > 10);
        System.out.println(coll);

        //Turning into Array
        Integer[] inArray = coll.toArray(new Integer[0]);
        System.out.println(Arrays.toString(inArray));
    }


}
