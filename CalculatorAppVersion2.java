package practice;

public class CalculatorAppVersion2 {
    //write a calculator program it should contain all methods and it should print outputs
    //a=10;b=5
    int a = 10;
    int b = 5;


    public int addition() {
        int result=a+b;
        return result;
    }

    public int subtraction() {
        int result = a - b;
        return result;
    }

    public int multiplication() {
        int result = a * b;
        return result;
    }

    public int division() {
        int result = a % b;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The Results are:");
        CalculatorAppVersion2 obj = new CalculatorAppVersion2();
//        int additionResult = obj.addition();
//        int subtractionResult = obj.subtraction();
//        int multiplicationResult = obj.multiplication();
//        int divisionResult = obj.division();

        System.out.println("The addition value is: " +obj.addition());
        System.out.println("The subtraction value is: " +obj.subtraction());
        System.out.println("The multiplication value is: " + obj.multiplication());
        System.out.println("The division value is: " +obj.division());
    }


}

//All print statements should be in the main method only