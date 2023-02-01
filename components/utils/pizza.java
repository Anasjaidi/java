package components.utils;

public class pizza {
  String name;
  int price;
  public pizza() {
    name = "";
    price = 0;
  }
  public pizza(String _name) {
    name = _name;
    price = 0;
  }
  public pizza(String _name, int _price) {
    name = _name;
    price = _price;
  }
  public void info() {
    System.out.println(name+" "+String.valueOf(price));
  }
}
