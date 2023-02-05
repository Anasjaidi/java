import java.util.Stack;

/**
 * stack
 */
public class stack {

  public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();

    System.out.println(stack.empty()); // true
    
    stack.push("java");
    stack.push("javascript");
    stack.push("typescript");
    
    System.out.println(stack.empty()); // false

    System.out.println(stack); // [java, javascript, typescript]

    String poped = stack.pop();

    System.out.println("poped: "+poped); // poped: typescript

    System.out.println(stack); // [java, javascript]

    System.out.println("top in stack (last in): "+stack.peek()); // top in stack (last in): javascript
    
    System.out.println(stack.search("javascript")); // 1-indexed: 1 from top

    System.out.println(stack.search("java")); // 2 from top

    System.out.println(stack.search("c++")); // -1 : not exist
    
    System.out.println("size is: "+stack.size()); // size is: 2
    
  }
}