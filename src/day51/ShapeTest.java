package day51;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {

       Shape s1 = new Circle();
        Shape s2 = new Triangle();
        Shape s3 = new Square();
        Shape s4 = new Rectangle();
        Shape[] manyShapes ={s1,s2,s3,s4, new Triangle(),s2};
        for (Shape each :manyShapes) {
           each.draw();
        }

        List<Shape> lst = new ArrayList<>(Arrays.asList(s1,s2,s3,s4));
        for (Shape eachLst :lst) {
            eachLst.draw();
        }

      //  Shape sh1 = new day49.Circle("sun",);
    }


}
