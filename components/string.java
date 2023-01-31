package components;

public class string {
  public static void main(String[] args) {
    String name = "anas jaidi";

    System.out.println(name.equals("anas jaidi"));
    System.out.println(name.equalsIgnoreCase("Anas jaidi"));
    System.out.println(name.charAt(0));
    System.out.println(name.indexOf('j'));
    System.out.println(name.length());
    System.out.println(name.isEmpty());
    System.out.println(name.toLowerCase());
    System.out.println(name.toUpperCase());
    System.out.println(name.replace('a', 'A'));
    System.out.println(name.trim());
    
    
  }
}
