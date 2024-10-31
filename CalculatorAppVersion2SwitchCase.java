package practice;

public class CalculatorAppVersion2SwitchCase {
    int a = 10;
    int b = 5;

    public int calculator(int operation) {
        int result = 0;
        switch (operation) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The Results are:");
        CalculatorAppVersion2SwitchCase objs = new CalculatorAppVersion2SwitchCase();
        System.out.println("The addition value is: " + objs.calculator(1));
        System.out.println("The subtraction value is: " + objs.calculator(2));
        System.out.println("The multiplication value is: " + objs.calculator(3));
        System.out.println("The division value is: " + objs.calculator(4));
    }
}
