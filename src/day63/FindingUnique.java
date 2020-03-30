package day63;

import java.util.*;

public class FindingUnique {
    public static void main(String[] args) {

        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";
       Set<Character> unique = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            unique.add(str.charAt(i));
        }
        System.out.println("How many character overall? " + str.length());
        System.out.println("How many unique characters ? " + unique.size());
        System.out.println("charset = " + unique);

        for (Character eachChar :unique) {
            System.out.println("eachChar = " + eachChar);
        }


    }


}
