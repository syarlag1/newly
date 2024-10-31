package practice;

public class OverloadingExample {
    public void sample(){
        System.out.println("First Method");
    }
    public void sample(int num){
        System.out.println("second method:"+num);
    }
    public static void main(String[] args) {
        OverloadingExample obj =new OverloadingExample();
        obj.sample();
        obj.sample(10);


    }
}
//one parent class and we have one child class c1 another child class c2 both class extending parent class with 10 methods
// c1(2 methods) ->p(10 methods)
