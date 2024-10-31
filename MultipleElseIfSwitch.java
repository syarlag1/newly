package practice;

public class MultipleElseIfSwitch {
    public static void main(String[] args) {
        int number;
        switch (number = 20){
            case 1:
                System.out.println("Number is positive ");
                break;
            case -1:
                System.out.println("Number is negative ");
                break;
            case 0:
                System.out.println("Number is zero ");
                break;
        }
        switch (number % 2){
            case 0:
                System.out.println("Number is even ");
                break;
            case 1:
                System.out.println("Number is odd ");
                break;
        }
          switch (number % 5){
              case 0:
                  System.out.println("Number is divisible by 5");
                  break;
              case 1:
                  System.out.println("Number is not divisible by 5 ");
                  break;
          }
            }
    }
