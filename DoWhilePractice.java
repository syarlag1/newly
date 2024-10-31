package practice;

public class DoWhilePractice {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is for-loop for i statement:" + i);
        }
        for (int j = 100; j < 101; ++j) {
            System.out.println("This is for-loop for j statement:" + j);
            do {
                System.out.println("This is do statement:"+j);
            } while (j < 100);
        }
    }
}
//This is for -loop for i statement:0
//This is for -loop for J statement:100
//This is do statement:100
//This is for -loop for i statement