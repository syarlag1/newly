package practice;

public class CalculatorAppV1 {
    //write a calculator program it should contain all methods and it should print outputs
    //a=10;b=5
    int a=10;
    int b=5;
    public int addition(){
         int result=a+b;
        System.out.println("The addition value is:"+result);
        return result;
    }
    public int subtraction() {
        int result = a - b;
        System.out.println("The subtraction Value is:" + result);
        return result;
    }
    public  int multiplication() {
        int result = a * b;
        System.out.println("The multiplication  Value is:" + result);
        return result;
    }
    public  int division() {
        int result = a % b;
        System.out.println("The multiplication  Value is:" + result);
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The Results are:");
        CalculatorAppV1 obj =new CalculatorAppV1();
        obj.addition();
        obj.subtraction();
        obj.multiplication();
        obj.division();
    }



    }
