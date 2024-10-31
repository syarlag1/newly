package practice;

public class StringBuilderPractice {
    public static void main(String[] args) {
        StringBuilder sbp =new StringBuilder("Sairam yarlagadda example");
        int i=123;
        Object obj= 345;
      System.out.println(""+sbp.toString());
      System.out.println(""+sbp.append(0));
      System.out.println(""+sbp.append(" geeks "));
      System.out.println(""+sbp.append(591995));
        System.out.println(""+sbp.append('k'));
        System.out.println(""+sbp.append( 54.82));
        System.out.println(""+sbp.append(3.8f));
        System.out.println(""+sbp.append(true));
        System.out.println(""+sbp.insert(10,i));
        System.out.println(""+sbp.insert(15,obj));
        System.out.println(""+sbp.insert(1,'k'));
        System.out.println(""+sbp.insert(2,12345));
        System.out.println(""+sbp.insert(10,123.456f));
        System.out.println(""+sbp.insert(0,true));
        System.out.println(""+sbp.insert(8,"hello"));
        System.out.println(""+sbp.insert(9,123.456d) );
        System.out.println(""+sbp.deleteCharAt(9));
        System.out.println(""+sbp.toString());
        System.out.println(""+sbp.lastIndexOf("example"));
        System.out.println(""+sbp.lastIndexOf("example",18));
        System.out.println(""+sbp.reverse());
        System.out.println(""+sbp.length());
        System.out.println(""+sbp.hashCode());
        System.out.println(""+sbp.replace(0,8,"maybe"));
        System.out.println(""+sbp.delete(0,8));
        System.out.println(""+sbp.getClass());
        System.out.println(""+sbp.deleteCharAt(11));
    }
}
