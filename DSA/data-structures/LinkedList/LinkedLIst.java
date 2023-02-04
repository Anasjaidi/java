import java.util.LinkedList;

import javax.swing.Popup;

public class LinkedLIst {
  public static void main(String[] args) {
    LinkedList<String> linkedlist = new LinkedList<String>();

    /**
     * since linkedlist implms Stack and more we can traited as a stack
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
    
    linkedlist.clear();
    /**
     * also we can trait is a queue
     * first in first out
    */
    linkedlist.offer("A");
    linkedlist.offer("B");
    linkedlist.offer("C");
    linkedlist.offer("D");
    linkedlist.offer("E");
    linkedlist.offer("F");
    
    System.out.println(linkedlist); // [A, B, C, D, E, F]

    poped = linkedlist.poll();

    System.out.println("poped: "+poped); // poped: A

    System.out.println(linkedlist); // [B, C, D, E, F]
    
    
    
  }
}
