package examples;

import java.util.Scanner;

public class hypotenuse {
  public static void main(String[] args) {
    double a, b, c;

    Scanner scan = new Scanner(System.in);

    System.out.print("type length of a: ");
    a = scan.nextDouble();

    System.out.print("type lenght of b: ");
    b = scan.nextDouble();
    c = Math.sqrt((a * a + b * b));
    System.out.println("length of c is: "+c);
  } 
}
