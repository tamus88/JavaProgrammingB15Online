package repl;

public class Repl111 {

    public static void main(String[] args) {
        int k = 1;
        int total = 0;
        do {
            System.out.println(k);
            k++;
        } while (k <= 50);


        for (k = 1; k <= 50; k++) {
            total +=k*k;
            System.out.print(total);
          //  System.out.print(k + "*" + k + "+");
        }
    }

}



