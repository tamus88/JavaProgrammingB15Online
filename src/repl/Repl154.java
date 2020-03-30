package repl;

import java.util.Scanner;

public class Repl154 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {

            arr[i] = inp.nextInt();
        }
        //#2 Your code here
        isPos(arr);
        System.out.println(max(10,25));
    }

    public static void isPos(int[] arr) {
        //#1 your code here
        for (int each : arr) {


            if (each > 0) {
                System.out.println("positive");
            } else {
                System.out.println("not positive");

            }
        }
    }

        public static int max(int x,int  max){

            if(x>max){
                return max;
            }else{
                return x;
            }



        }
    }







