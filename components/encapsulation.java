package components;

import components.utils.CarEncapsulation;

public class encapsulation {
  public static void main(String[] args) {
    CarEncapsulation c1 = new CarEncapsulation();
    c1.setModel("corvette");
    c1.setYear(2020);
    System.out.println(c1.getModel());
    System.out.println(c1.getYear());
    
  }
}
