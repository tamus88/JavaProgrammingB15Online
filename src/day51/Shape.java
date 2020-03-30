package day51;

public abstract class Shape {

public abstract void draw();
}
class Triangle extends Shape{

    @Override
    public void draw(){
        System.out.println("Drawing triangle");
    }
}
class Circle extends Shape{

    @Override
    public void draw(){
        System.out.println("Drawing circle");
    }
}
class Square extends Shape{

    @Override
    public void draw(){
        System.out.println("Drawing square");
    }
}
class Oval extends Shape{

    @Override
    public void draw(){
        System.out.println("Drawing oval");
    }
}
class Rectangle extends Shape{

    @Override
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}