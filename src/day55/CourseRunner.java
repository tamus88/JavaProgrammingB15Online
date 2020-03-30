package day55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseRunner {
    public static void main(String[] args) {

        List<String> lst = new ArrayList<>(Arrays.asList("Muge","Hasan","Guvanch","Tamara"));

        Course c1 = new Course("Java",lst);
        System.out.println("c1 = " + c1);
        c1.studentNames.add("Malika");
        c1.studentNames.add("Zumrat");
        c1.studentNames.add("Selbi");
        c1.studentNames.add("Lachin");
        c1.studentNames.addAll(Arrays.asList("Gulya","Samira","Nikolas"));
        c1.addStudent("Gail");
        c1.addManyStudent(Arrays.asList("Kolya","Marina","Julia"));

        System.out.println("c1 student names = " + c1.studentNames);
        System.out.println("my original lst = " + lst);



    }



}
