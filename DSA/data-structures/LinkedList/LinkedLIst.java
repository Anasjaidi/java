import java.util.LinkedList;

import javax.swing.Popup;

public class LinkedLIst {
  public static void main(String[] args) {
    LinkedList<String> linkedlist = new LinkedList<String>();

    /**
     * since linkedlist implms Queue and more we can traited as a stac
     * last in first out
    */
    linkedlist.push("A");
    linkedlist.push("B");
    linkedlist.push("C");
    linkedlist.push("D");
    linkedlist.push("E");
    linkedlist.push("F");

    System.out.println(linkedlist); // [F, E, D, C, B, A]

    String poped = linkedlist.pop();

    System.out.println("poped: "+poped); // poped: F

    System.out.println(linkedlist); // [E, D, C, B, A]
    
    
    
  }
}
