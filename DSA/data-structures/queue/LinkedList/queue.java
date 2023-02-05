import java.util.LinkedList;
import java.util.Queue;

/**
 *? queue
 **   first in first out (fifo) data struture
 **   enqueue: add elemnt from the end of queue
 **   dequeue: remove element from the begging of the queue
 **   queue: is only a interface so we can't initiate it ther we will use a class thats implements this interface:
 **   LinkedList
 **   PrioretyQueue
 */
public class queue {

  public static void main(String[] args) {

    Queue<String> queue = new LinkedList<String>();


    /*
    * queue includes only 3 methodes the rest is comme with LinkList class
    * offer: add elemnt to the end of queue
    * poll:  remove the first element in th queue
    * peek:  return first element
    */


    /*
     * thes collection of methodes only return values in error case
    */

    queue.offer("java");
    queue.offer("javascript");
    queue.offer("typescript");

    System.out.println(queue.peek()); // java
    
    String poped = queue.poll();
    
    System.out.println("poped: "+poped); // poped: java
    
    System.out.println(queue.size()); // 2
    
    System.out.println(queue.peek()); // javascript
    
    /*
     * and the equveilant of these methodes that throws exception in error case
     * add: add elemnt
     * remove: pop element
     * element: peek first element
    */
  }
}