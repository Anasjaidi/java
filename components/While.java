package components;

import java.util.Scanner;

public class While {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String name = "";

    while (name.isBlank()) {
      System.out.print("enter your name: ");
      name = scan.nextLine();
    }
    System.out.println(name);
    
  }
}
