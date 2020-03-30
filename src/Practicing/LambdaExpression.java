package Practicing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpression {
    public static void main(String[] args) {

        Predicate<Integer> remove100 = p -> p == 100;

        List<Integer> lst = new ArrayList<>(Arrays.asList(100, 100, 100, 105, 200));
        lst.removeIf(remove100);
        System.out.println("lst = " + lst);
        List<Integer> lst2 = new ArrayList<>(Arrays.asList(100, 100, 400, 305, 200));
        lst2.removeIf(l -> l > 300);
        System.out.println("lst2 = " + lst2);

        List<Integer> lst3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 8));
        lst3.forEach(p -> {
            if (p < 5) {
                System.out.println("p = " + p);
            }
        });

        lst3.forEach(System.out::println);

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmet", "Ibrohim", "Madina", "Mehmet"));

        Predicate<String> removET = p -> p.endsWith("et");
        names.removeIf(removET);
        System.out.println(names);
        int[] nums = {1, 2, 3};


    }


    }
