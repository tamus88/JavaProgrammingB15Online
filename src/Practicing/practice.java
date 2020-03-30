package Practicing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {5, 33, 9}};
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) { // checks each index of two dimensional array
            for (int j = 0; j < arr[i].length; j++) {// checks each elements of single dimensional array
                if (max < arr[i][j]) {
                    max = arr[i][j];


                }

            }
        }
        arr[0] = arr[max];
        arr[1] = arr[max];
        arr[5] = arr[max];
        System.out.println(Arrays.toString(arr));

    }
}