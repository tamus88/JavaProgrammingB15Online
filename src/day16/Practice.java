package day16;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


    String keywordToSearch = "Java";
    String tabTitle = keywordToSearch + " - Google Search";

    if(tabTitle.startsWith(keywordToSearch) && tabTitle.endsWith(" - Google Search") ){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }





    }
}
