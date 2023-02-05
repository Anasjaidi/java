import java.util.ArrayList;

public class dynamicArray {
  int capacity = 10;
  int size;
  Object[] arr;

  public dynamicArray() {
    arr = new Object[capacity];
  }
  public dynamicArray(int _capacity) {
    arr = new Object[_capacity];
    capacity = _capacity;
  }
}
