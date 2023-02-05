public class Main {
  public static void main(String[] args) {
    dynamicArray x = new dynamicArray();

    x.add("0");
    for (int i = 0; i < 100; i++) {
      x.add("A");
    }
    System.out.println(x.capacity);

    while (x.search("A") != -1) {
      x.delete("A");
    }

    System.out.println(x.capacity);
  }
}
