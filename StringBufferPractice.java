package practice;

public class StringBufferPractice {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Sairam");
        int i= 123;
        Object obj =345;
        System.out.println(""+sb.toString());
        System.out.println(""+sb.append(0));
        System.out.println(""+sb.append(" geeks "));
        System.out.println(""+sb.append(591995));
        System.out.println(""+sb.append('k'));
        System.out.println(""+sb.append( 54.82));
        System.out.println(""+sb.append(3.8f));
        System.out.println(""+sb.append(true));
        System.out.println(""+sb.insert(10,i));
        System.out.println(""+sb.insert(15,obj));
        System.out.println(""+sb.insert(1,'k'));
        System.out.println(""+sb.insert(2,12345));
        System.out.println(""+sb.insert(10,123.456f));
        System.out.println(""+sb.insert(0,true));
        System.out.println(""+sb.insert(8,"hello"));
        System.out.println(""+sb.insert(9,123.456d) );
        System.out.println(""+sb.deleteCharAt(9));
        System.out.println(""+sb.toString());
        System.out.println(""+sb.lastIndexOf("example"));
        System.out.println(""+sb.lastIndexOf("example",18));
        System.out.println(""+sb.reverse());
        System.out.println(""+sb.length());
        System.out.println(""+sb.hashCode());
        System.out.println(""+sb.replace(0,8,"maybe"));
        System.out.println(""+sb.delete(0,8));
        System.out.println(""+sb.getClass());
        System.out.println(""+sb.deleteCharAt(11));

    }
}
