package practice;

public class IntegerPractice{

    public static void main(String[] args) {
        int i=0;
        Integer j=5;
        OverloadingExample oe = new OverloadingExample();
        oe.sample();
        IntegerPractice ip =new IntegerPractice();
        String K=ip.Sample();
        System.out.println("This is the String output:"+K);
        System.out.println("This is the string output:"+ip.Sample());
        System.out.println("This is the output:"+i);
        System.out.println("This is the integer output:"+j);
        int c=ip.Sample(10,5);
        System.out.println("This is the integer Statement:"+c);
    }
    public String Sample(){
        String s= "Sai";
        return s;
    }
    public int Sample(int a, int b){
        int c= a+b;
        return c;
    }
}
//Method A=int,String
  //Method b =String,int
//Methods having same name but difference in types of parameters and number of parameters is called method overloading