package practice;

public class StringsPractice {
    public static void main(String[] args) {
        String s=" Sairam ";
        System.out.println("The string length is:"+s.length());
        System.out.println("The character is:"+s.charAt(3));
        System.out.println("The substring is:"+s.substring(2));
        System.out.println(""+s.substring(2,5));
        System.out.println(""+s.concat(" Hello"));
        System.out.println(" "+s.startsWith("sairam"));
        System.out.println(""+s.codePointAt(5));
        System.out.println(""+s.codePointBefore(4));
        System.out.println(""+s.codePointCount(2,5));
        System.out.println(""+s.compareTo("Sairam"));
        System.out.println(""+s.compareToIgnoreCase("krishna"));
        System.out.println(""+s.isEmpty());
        System.out.println(""+s.replace('S','a'));
        System.out.println(""+s.trim());
        System.out.println(""+s.toUpperCase());
        System.out.println(""+s.toLowerCase());
        System.out.printf(""+s.toString());
        System.out.println(""+s.toCharArray());
        System.out.println(""+s.split("Sairam"));
        System.out.println(""+s.endsWith(" "));
        System.out.println(""+s.getBytes());
        System.out.println(""+s.toCharArray());
        System.out.println(""+s.matches("Sairam"));
        System.out.println(""+s.chars());
        System.out.println(""+s.replaceAll(" sairam ","sairam"));
        System.out.println(""+s.replace('m','a'));
        System.out.println(""+s.replaceFirst(" ","Thankyou"));
        System.out.println(""+s.hashCode());
        System.out.println(""+s.lastIndexOf('m'));
        System.out.println(""+s.getClass());
    }
}
