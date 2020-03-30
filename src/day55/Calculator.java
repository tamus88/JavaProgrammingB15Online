package day55;

public class Calculator {

int result;

public Calculator minusNum(int num){
    this.result-= num;
    return this;
}

public Calculator addNum(int num){
    this.result+= num;
return this;
}

    public static void main(String[] args) {

    Calculator c1 = new Calculator();
    c1.addNum(100).addNum(200).addNum(100).minusNum(50);
        System.out.println(c1.result);


}
}
