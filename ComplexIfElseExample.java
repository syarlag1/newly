package practice;

public class ComplexIfElseExample {
    public static void main(String[] args) {
        int choice = 3;
        double num1 = 10.5;
        double num2 = 5.2;
        double result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Addition Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Subtraction Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Multiplication Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
    }
