package components;

public class vars {
  public static void main(String[] args) {
    boolean bol = true; // primitive, 1b, (true, false)
    byte by = 12; // primitive, 1b, (-128, 127)
    short sh = 12; // primitive, 2b, (-32k, 32k)
    int i = 12; // primitive, 4b, (-2b, 2b)
    long l = 12; // primitive, 8b, (-9q, 9q)
    float f = 3.141255667777f; // primitive, 4b, (up to 6-5 digit fraction)
    double d = 3.1423456789876756745353434324232433232323; // primitive, 8b, (up to 16-15 digit fraction)
    char c = 'a'; // primitive 1b, ascii
    String s = "anas jaidi\n"; // ref

    System.out.println(bol);
    System.out.println(by);
    System.out.println(sh);
    System.out.println(i);
    System.out.println(l);
    System.out.println(f);
    System.out.println(d);
    System.out.println(c);
    System.out.println(s);
  }
}
