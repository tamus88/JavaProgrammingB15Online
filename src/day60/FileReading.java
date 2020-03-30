package day60;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReading {
    public static void main(String[] args)throws IOException {

        List<String> allLines = Files.readAllLines(Paths.get("src/hero.txt")) ;
        System.out.println("allLines = " + allLines);

        for (String eachLine :allLines) {
            System.out.println("eachLine = " + eachLine);
        }

//        List<String> allLines2 = Files.readAllLines(Paths.get("src/day60/note.txt")) ;
//        System.out.println("allLines = " + allLines);

    }




}
