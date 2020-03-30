package day55;

import java.util.List;

public class CourseX {

    String topic;
    List<Student> studentLst;

    public CourseX(String topic, List<Student> studentLst) {
        this.topic = topic;
        this.studentLst = studentLst;
    }
public void addStudent(Student name){
        studentLst.add(name);
}
    @Override
    public String toString() {
        return "CourseX{" +
                "topic='" + topic + '\'' +
                ", studentLst=" + studentLst +
                '}';
    }
}
