package practice;

public class EnhancedLoopComplexity {
    public static void main(String[] args) {
        String[] numbers = {"3133299298", "9255686917", "7039359059", "9848022338"};

        System.out.println("Using For Loop with Multiple Conditions:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("For Loop Value is: " + i);
            System.out.println("Array value is: " + numbers[i]);

            if (numbers[i].startsWith("9")) {
                continue;
            }

            if (numbers[i].length() > 10) {
                System.out.println("Number with more than 10 digits found: " + numbers[i]);
            } else {
                System.out.println("Number with 10 or fewer digits: " + numbers[i]);
            }

            if (numbers[i].contains("69")) {
                System.out.println("Number containing '69' found: " + numbers[i]);
            }
        }
    }
}
//Using For Loop with Multiple Conditions:
//For Loop Value is: 0
//Array value is: 3133299298
//

//For Loop Value is: 1
//Array value is: 9255686917
//Number with 10 or fewer digits:9255686917
//Number containing '69' found:9255686917

//For Loop Value is: 2
//Array value is: 7039359059
//Number with 10 or fewer digits:7039359059

//For Loop Value is: 3
//Array value is: 9848022338
//Number with 10 or fewer digits:9848022338





