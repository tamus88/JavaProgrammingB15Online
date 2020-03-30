package repl;

import java.util.Arrays;

public class Repl207 {

    public static void main(String[] args) {

int[] i = {5,1,2,3,10};
        do_switch(i);

    }
    public static int[] do_switch(int[] i){

        int tempCont = i[0];
        i[0]= i[i.length-1];
        i[i.length-1]=tempCont;
        System.out.println(Arrays.toString(i));


        return i;
    }

}

