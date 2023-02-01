package components.utils;


public class Human {
  String name;
  int age;
  public Human(String _name, int _age) {
   name = _name;
   age = _age;
  }
  public void whoami() {
    System.out.println("Hi, i'm "+ name);
    System.out.print("And, my age "+age);
  }
  @Override
  public String toString() {

    return "{\n" + "\t" + name + "\n\t" + age + "\n}";
  }
}
