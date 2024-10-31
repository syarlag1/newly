package practice;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ram");
        list.add("krishna");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Yarlagadda");
        list2.add("Sai");
        System.out.println(""+list);
        System.out.println(""+list.size());
        System.out.println(""+list.getClass());
        System.out.println("" + list.remove(1));
        System.out.println(""+list.get(0));
        System.out.println(""+list.hashCode());
        System.out.println(""+list.toString());
        System.out.println(""+list.set(0,"Sai"));
        System.out.println(""+list.addAll(list2));
   }
    }
