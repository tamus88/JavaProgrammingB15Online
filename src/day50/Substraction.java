package day50;

public class Substraction extends Question {

    public Substraction(int num1,int num2) {
        super("-", "substraction question");
   if(num1<num2){
       int temp = num1;
       num1 = num2;
       num2 = temp;
   }
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void calculate() {
        answer = num1-num2;
        calculated = true;
    }

    public String toString(){
        if(calculated==true){
           return num1 + operator + num2 + " = " + answer ;
        }else{
           return  num1 + operator + num2 + " = " ;
        }
    }

}
