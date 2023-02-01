package components;

import components.utils.pizza;

public class overloadedConstructor {
  public static void main(String[] args) {
    pizza a = new pizza();
    pizza b = new pizza("paip");
    pizza c = new pizza("paip", 20);

    a.info();
    b.info();
    c.info();
  }
}
