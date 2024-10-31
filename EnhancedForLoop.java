package practice;

public class EnhancedForLoop {
        public static void main(String[] args) {
            String[] numbers = {"3133299298", "9255686917", "7039359059", "9848022338"};

            // For loop with if condition and break
            System.out.println("Using For Loop with If Condition and Break:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("For Loop Value is: " + i);
                System.out.println("Array value is: " + numbers[i]);
                if (numbers[i].startsWith("9")) {
                    System.out.println("Number starting with '9' found: " + numbers[i]);
                    break;
                }
            }

            // For loop with if condition and continue
            System.out.println("\nUsing For Loop with If Condition and Continue:");
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i].endsWith("17")) {
                    System.out.println("Skipping " + numbers[i] + " as it ends with '17'");
                    continue;
                }
                System.out.println("Array value is: " + numbers[i]);
            }
        }
    }
// Using For Loop with If condition and Break:
//for loop value is : 0
//Arra Value is : 3133299298
//for loop value is : 1
//Array Value is : 9255686917
//Numbers starting with '9' Found :+9255686917
//nUsing For Loop with If condition and continue:
//Skipping 9255686917 as it ends with 17
//Array Value is: 313329928
