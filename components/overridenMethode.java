package components;

import components.utils.Car;

public class overridenMethode extends Car {
  public static void main(String[] args) {
    foo();
  }
  @Override
   public void foo() {
    System.out.println("bar");
  }
}
