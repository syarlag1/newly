package practice;

public class ForLoopWithConditions {
        public static void main(String[] args) {
            // Sample array of numbers
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            System.out.println("Using break:");
            for (int number : numbers) {
                if (number == 5) {
                    System.out.println("Break at " + number);
                    break;
                }
                System.out.println(number);
            }

            System.out.println("\nUsing continue:");
            // Using continue statement to skip iterations when a condition is met
            for (int number : numbers) {
                if (number % 2 == 0) {
                    System.out.println("Skipping " + number);
                    continue;
                }
                System.out.println(number);
            }
        }
    }
