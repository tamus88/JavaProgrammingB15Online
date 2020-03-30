package homeWork;

import java.util.ArrayList;
import java.util.List;

public class ArraysClassWithMuhtar {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        List<Double> priceList = new ArrayList<>();
        lst.add(7);
       lst.add(5);
        lst.add(10);
       //printAlist(lst);
      // int[] arr ={1,2};
      int sum = sum(lst);
        System.out.println("sum = " + sum);
        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

       // test();

        }
    public static int sum(ArrayList<Integer> ints) {
        //write code here
        List<Integer> lst = new ArrayList<>();
       int sum = 0;
        for (int i = 0; i < ints.size(); i++) {
        sum+=ints.get(i);
        }

       return sum;
    }
    public static void test(ArrayList<Double> dubs) {
        //write code here
        List<Double> priceList = new ArrayList<>();
        //for (int x = 0; x < dubs.size(); x++) {
        priceList.remove(0);
        priceList.remove(1);
        }
  //public static void List<Integer> insert100Between(ArrayList<Integer>){

  }





   //    Given a ArrayList of 6 Integer 1,3,7,2,12,7
//    insert 100 in between each numbers
//    For example :
//            1,100,3 ,100, 7, 100, 2, 100, 12, 100, 7
//
//    Optionally make it a method
//    write a static void method that accept a ArrayList of integer object and insert 100 in between items.

//}








