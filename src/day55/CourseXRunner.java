package day55;

import java.util.ArrayList;
import java.util.List;

public class CourseXRunner {
    public static void main(String[] args) {


        List<Student> myLst = new ArrayList<>();
        myLst.add(new Student("Mimi",101));
        myLst.add(new Student("Misha",234));

        CourseX java = new CourseX("Has-A",myLst);
        java.addStudent(new Student("Olya",110));
        System.out.println("java = " + java);
    }


}
