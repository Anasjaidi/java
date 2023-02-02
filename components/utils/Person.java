package components.utils;

public class Person {
  String name;
  int age;
  
  public Person(String _name, int _age) {
    super();
    name = _name;
    age = _age;
  }
  @Override
  public String toString() {
    return name+"\n"+age+"\n";
  }
}
