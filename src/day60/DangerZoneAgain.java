package day60;

import java.io.FileNotFoundException;

public class DangerZoneAgain {
    public static void main(String[] args) throws InterruptedException {//FileNotFoundException

        try {
            readMyFile();
        } catch (FileNotFoundException e) {
            System.out.println("Handling here! just moving on");
        }
        Thread.sleep(4000);
        System.out.println("The end");
    }
    public static void readMyFile()throws FileNotFoundException {
        System.out.println("Reading the file in my computer");
        throw new FileNotFoundException("Kaboom! file is not here");
    }

}
