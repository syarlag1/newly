package practice;

public class StatesProgram {
    public static void main(String[] args) {
        String[] s = {"Virginia", "New Jersey", "Arizona", "California", "Alabama", "Texas"};
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("Virginia") || s[i].equals("New Jersey")) {
                System.out.println("The states are on the eastern cost:" + s[i]);
            }
            else if (s[i].equals("Arizona") || s[i].equals("California")) {
                System.out.println("The states are on the Western  cost:" + s[i]);
            }
            else if (s[i].equals("Alabama") || s[i].equals("Texas")) {
                System.out.println("The states are on the central cost:" + s[i]);

            }

        }
    }
}

