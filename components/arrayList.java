package components;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
      ArrayList<Integer> arr = new ArrayList<Integer>();

      
      arr.add( 1);
      arr.set( 0,2);
      System.out.println(arr.get(0));
      System.out.println(arr.size());
      
    }
}
