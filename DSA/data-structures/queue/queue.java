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
  }
}