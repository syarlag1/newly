package practice;

public class DoWhilePracticeTwo {
    public static void main(String[] args) {
        int i=5;
        do {
            System.out.println("This is do -statement:" + i);
            for (int j=0; j < 10; j++) {
                System.out.println("This is for loop statement:" + j);
            }
            for (int k=0; k < 10; k++) {
                System.out.println("This is for loop statement:" + k);
            }
        } while (i < 5) ;
    }
}
//This is do-statement:5
//This is for loop statement j:0
//This is for loop statement j:1
//This is for loop statement j:2
//This is for loop statement j:3
//This is for loop statement j:4
//This is for loop statement j:5
//This is for loop statement j:6
//This is for loop statement j:7
//This is for loop statement j:8
//This is for loop statement j:9
//This is for loop statement k:0
//This is for loop statement k:1
//This is for loop statement k:2
//This is for loop statement k:3
//This is for loop statement k:4
//This is for loop statement k:5
//This is for loop statement k:6
//This is for loop statement k:7
//This is for loop statement k:8
//This is for loop statement k:9
