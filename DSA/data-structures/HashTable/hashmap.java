import java.util.HashMap;

/**
 * hashmap
 */
public class hashmap {

  public static void main(String[] args) {
    HashMap<String, Integer> a = new HashMap<String, Integer>();
    a.put("anas", 0);

    System.out.println(a.get("anas"));
    
    System.out.println(a.containsKey("anas"));
    
    System.out.println(a.containsValue(0));
    
    a.replace("jaidi", 12);

    System.out.println(a.containsKey("jaidi"));


    a.put("anas", 7);
    
    a.putIfAbsent("jaidi", 12);
    System.out.println(a);
  }
}