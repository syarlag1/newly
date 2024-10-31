package practice;

public class StatesVirginia {
    public static void main(String[] args) {
        String[] states ={"Alabama","California","Texas","Virginia","New Jersey"};
        for (int i=0;i< states.length;i++){
            if (states[i].contains("Virginia")){
                System.out.println("The State is in the eastern coast:"+states[i]);
            }
            else {
                System.out.println("The State is not  in the eastern coast:"+states[i]);
            }
        }
    }
}
