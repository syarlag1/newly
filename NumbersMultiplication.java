package practice;

public class NumbersMultiplication {
    public static void main(String[] args) {
        int[] numbers = {22, 66, 33, 1, 2, 3, 4, 9};
        for (int i=0;i<numbers.length;i++){
            int multiplication=numbers[i]*2;
            System.out.println("The numbers are multiplied with two:"+multiplication);

        }
    }
}
