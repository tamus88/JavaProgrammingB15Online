package repl;

import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {

        int arr[] =new int[2];
        System.out.println("Result A" + 0 + 1);
        System.out.println("Result B" + (1) +(2));
    String str = " ";
    str.trim();
        System.out.println(str.equals(""));

        String[][] arr1 = {{"A","B","C"},{"D","E","B","A"}};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println(arr1[i][j]);
           if(arr1[i][j].equals("B")){
               break;
           }

            }
        }


    }

}
