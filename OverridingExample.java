package practice;

public class OverridingExample extends OverloadingExample {
    public void sample() {
        System.out.println("Here it is running");
    }
        public static void main (String[]args){
            OverridingExample obj = new OverridingExample();
            obj.sample();
        }
    }

//overloading : When the method is in the same class which have the same method but different in type of parameters and number of parameters
// overriding: In a class whatever method parent class has availabe in the child class with same method name.and same parameters
