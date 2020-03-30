package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadingFilePractice {
    public static void main(String[] args) throws IOException {

        List<String> allData = Files.readAllLines(Paths.get("src/day63/employeeData.txt"));
        Map<Integer, String> idNamePair = new HashMap<>();
        for (String each :allData) {
           // System.out.println("each = " + each);

            // lambda method
            //  allData.forEach(each-> System.out.println("each = " + each));

            // String line = "1,Lilian";
            int id = Integer.parseInt(each.split(",")[0]);
            String name = each.split(",")[1];
            idNamePair.put(id, name);
        }
            System.out.println("idNamePair = " + idNamePair);

    }
}
