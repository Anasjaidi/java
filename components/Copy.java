package components;

import components.utils.CarCopy;

public class Copy {
  public static void main(String[] args) {
    CarCopy c1 = new CarCopy();
    CarCopy c2 = new CarCopy();
    
    c2.setModel("bmw");
    c2.setYear(2019);
    c1.copy(c2);
    CarCopy c3 = new CarCopy(c2);
    System.out.println(c1.getModel());
    System.out.println(c1.getYear());
    System.out.println(c2.getModel());
    System.out.println(c2.getYear());
    System.out.println(c3.getModel());
    System.out.println(c3.getYear());
    
  }
}
