package practice;

public class IterateNumbers {
    public static void main(String[] args) {
        int[] numbers={22,66,33,1,2,3,4,9};
        for(int i=0;i<numbers.length;i++){
            if (numbers[i]%2==0){
                System.out.println("The numbers divisible by 2 are:"+numbers[i]);
            }
//            else {
//                System.out.println("The numbers  not divisible are:"+numbers[i]);
            }
        }
    }
