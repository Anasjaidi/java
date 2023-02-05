public class Main {
  public static void main(String[] args) {
    dynamicArray x = new dynamicArray();

    x.add("A");
    x.add("B");
    x.add("C");
    x.insert(1, "S");

    x.delete("C");
    System.out.println(x);
  }
}
