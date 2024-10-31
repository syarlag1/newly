package practice;

public class ConstructorExample {
    public int i;

    public static void main(String[] args) {
        ConstructorExample Ce = new ConstructorExample();
    }
    public ConstructorExample(){
        i=20;
        System.out.println("Constructor is called");
    }
    public ConstructorExample(int a){
        a=i;
    }
}
