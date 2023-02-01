package components.utils;


public class Human {
  static String name;
  static int age;
  public Human(String _name, int _age) {
   name = _name;
   age = _age;
  }
  public static void whoami() {
    System.out.println("Hi, i'm "+ name);
    System.out.print("And, my age "+age);
  }
}
