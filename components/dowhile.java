package components;

import java.util.Scanner;

public class dowhile {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String name = "";

    do {
      System.out.print("enter your name: ");
      name = scan.nextLine();
      
    } while (name.isBlank());
  }
}
