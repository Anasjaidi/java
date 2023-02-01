package components;

public class overloadedMthodes {
  public static void main(String[] args) {
    System.out.println(add(0, 0));
    System.out.println(add(0, 0, 1));
    System.out.println(add(0, 0, 1, 2));
    System.out.println(add(0.2, 0));
    System.out.println(add(0, 0.2, 1));
    System.out.println(add(0, 0.2, 1, 2));
    
  }
  static int add(int a, int b) {
    return a + b;
  }
  static int add(int a, int b, int c) {
    return a + b + c;
  }
  static int add(int a, int b, int c, int d) {
    return a + b + c + d;
  }
  static double add(double a, double b) {
    return a + b;
  }
  static double add(double a, double b, double c) {
    return a + b + c;
  }
  static double add(double a, double b, double c, double d) {
    return a + b + c + d;
  }
}
