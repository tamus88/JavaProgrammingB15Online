package repl;
import java.util.*;

public class Repl142 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                arr[i][j] = inp.nextInt();
                int maxNum = arr[0][0];
                for (int y = 0; y < arr.length; y++) {
                    for (int x = 0; x < arr[y].length; x++) {

                        if (maxNum < arr[y][x]) {
                            maxNum = arr[y][x];
                        }
                    }
                    System.out.println("Max number is : " + maxNum);
                }
            }
        }
    }
}