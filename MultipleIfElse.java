package practice;

public class MultipleIfElse {
    public static void main(String[] args) {
        int num = 20;

        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // Checking if the number is even or odd
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // Checking if the number is divisible by 5
        if (num % 5 == 0) {
            System.out.println("Number is divisible by 5");
        } else {
            System.out.println("Number is not divisible by 5");
        }
    }
}
