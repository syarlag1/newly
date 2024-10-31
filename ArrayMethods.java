package practice;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] i = {1, 2, 0, 4, 5, 6, 99, 101, 0};
        for (int j = 0; j < i.length; j++) {
            System.out.print(" " + i[j]);
            if (j < i.length - 1) {
                System.out.print(",");
            }
        }
    }

}
//if array index position of last number not equals to int j then it will print the ","