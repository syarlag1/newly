package practice;

public class StatesForEachPractice {
    public static void main(String[] args) {
        String[] state = {"Virginia", "New Jersey", "California", "Arizona", "Texas", "Alabama"};

        for (String s : state) {
            if (s.equals("Virginia") || s.equals("New Jersey")) {
                System.out.println(state + " is on the Eastern Coast.");
            } else if (s.equals("California") || s.equals("Arizona")) {
                System.out.println(state + " is on the Western Coast.");
            } else if (s.equals("Alabama") || s.equals("Texas")) {
                System.out.println(state + " is in the Central Coast.");
            }
        }
    }
}
