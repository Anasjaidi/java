package components;

import java.util.Scanner;

public class scan {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("name ?");
    String name = scan.nextLine();
    System.out.println(name);
  }
}
