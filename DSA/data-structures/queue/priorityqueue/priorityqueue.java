import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * ? priorityqueue
 *    fifo ds that serves upon priority
 *    element with high priority before elent with lower priority
 */
public class priorityqueue {
  public static void main(String[] args) {
    Queue<Double> queue = new PriorityQueue<Double>();
    
    queue.offer(0.5);
    queue.offer(2.5);
    queue.offer(1.0);
    queue.offer(10.8);
    queue.offer(3.8);
    
    System.out.println(queue); // [0.5, 2.5, 1.0, 10.8, 3.8]
    
    Queue<String> queue1 = new PriorityQueue<String>(Collections.reverseOrder());


    queue1.offer("A");
    queue1.offer("C");
    queue1.offer("Z");
    queue1.offer("B");
    queue1.offer("D");

    System.out.println(queue1); // [Z, D, C, A, B]
    
  }
}
