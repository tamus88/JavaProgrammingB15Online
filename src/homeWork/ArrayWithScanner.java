package homeWork;

import java.util.Scanner;

public class ArrayWithScanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] inputs = new int[5];
        int count = 0;
        for (int i = 0; i < inputs.length; i++) {
            System.out.println("Give me a 5 number : ");
            inputs[i] = scan.nextInt();
            System.out.print(inputs[i] + " ");
        }

        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i] == 55) {
                count++;
            }
            System.out.print(inputs[i] + " ");

        }
        System.out.println();
        System.out.println(count);
    }

}
