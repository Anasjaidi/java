package components;

import java.util.ArrayList;

public class foreach {
  public static void main(String[] args) {

     String[] animals2 = {"cat", "dog", "bird"};
     
     for (String string : animals2) {
      System.out.println(string);
     }
     
    ArrayList<String> animals = new ArrayList<String>();

    animals.add("dog");
    animals.add("cat");
    animals.add("bird");

     for (String string : animals) {
      System.out.println(string);
     }
  }
}
