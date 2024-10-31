package practice;

public class ForEachPractice {
    static boolean b;
    public static void main(String[] args) {
        System.out.println(b);
        String[] numbers = {"3133299298","9255686917","7039359059","9848022338"};
//        for (int i=0;i<=numbers.length;i++){
//            System.out.println("For Loop Value is :"+i);
//            System.out.println(" Array value is:"+numbers[i]);
//        }
        for(String element:numbers)
        {
            if(element.startsWith("9"))
            {
                System.out.println("for-each loop statement is:"+element);
            }
            else if(element.startsWith("3")){
            System.out.println("else-if statement is:"+element);
        }
            else{
            System.out.println("This statement is not matching any condition:"+element);
        }
        }
    }

}
//for loop value is:0
//for loop value is :3133299298
//Array value is :3133299298
//for loop value is :92556869
//Array value is :92556869