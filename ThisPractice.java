package practice;

public class ThisPractice {
    int x;

    // Constructor with a parameter
    public ThisPractice(int x) {
        this.x = x;
    }

    // Call the constructor
    public static void main(String[] args) {
       ThisPractice myObj = new ThisPractice(5);
        System.out.println("Value of x = " + myObj.x);
    }
}
