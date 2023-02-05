import java.util.ArrayList;

public class dynamicArray {
  int capacity = 10;
  int size = 0;
  Object[] arr;

  public dynamicArray() {
    arr = new Object[capacity];
  }


  public dynamicArray(int _capacity) {
    arr = new Object[_capacity];
    capacity = _capacity;
  }

  public void add(Object _data) {
    if (size <= capacity) grow();
    arr[size++] = _data;
  }

  public void insert(int _i, Object _data) {

  }

  public void delete(Object data) {

  }

  public int search(Object data) {
    return -1;
  }

  private void grow() {

  }

  private void shrink() {

  }

  public boolean isEmpty() {
    return size == 0;
  }
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
  }
}
