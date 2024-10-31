package practice;

public class BreakContinueLoopPractice {
    public static void main(String[] args) {
        for (int i=0;i<10;i++) {
            System.out.println("for loop statement is:"+i);
            if (i==5)
            continue;
            System.out.println("This is continue statement:"+i);
        }
    }
}
// for loop statement is :0
// This is continue statement :0
//for loop statement is :1
// This is continue statement:1

