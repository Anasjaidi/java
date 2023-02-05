import java.util.ArrayList;
import java.util.LinkedList;

/**
 * arraysvslists
 */
public class arraysvslists {

  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
    ArrayList<String> arr = new ArrayList<String>();

    long startTime, endTime, elipsedTime;

    startTime = System.nanoTime();
    for (int i = 0; i < 1000000; i++) {
      list.add(""+i);
      // arr.add(""+i);
    }
    endTime = System.nanoTime();

    elipsedTime = endTime -startTime;

    System.out.println("adding list: " + (int)(elipsedTime / 1e6) +  " ms");
    startTime = System.nanoTime();
    for (int i = 0; i < 1000000; i++) {
      // list.add(""+i);
      arr.add(""+i);
    }
    endTime = System.nanoTime();

    elipsedTime = endTime -startTime;

    System.out.println("adding arr: " + (int)(elipsedTime / 1e6) +  " ms");
    startTime = System.nanoTime();
    for (int i = (int)1e5; i >= 0; i--) {
      list.indexOf(""+i);
      // arr.indexOf(""+i);
    }
    endTime = System.nanoTime();

    elipsedTime = endTime -startTime;

    System.out.println("search list: " + (int)(elipsedTime / 1e6) +  " ms");
    startTime = System.nanoTime();
    for (int i = (int)1e5; i >= 0; i--) {
      // list.add(""+i);
      arr.indexOf(""+i);
    }
    endTime = System.nanoTime();

    elipsedTime = endTime -startTime;

    System.out.println("search arr: " + (int)(elipsedTime / 1e6) +  " ms");
    

  }
}