import java.util.ArrayList;

import org.w3c.dom.css.CSS2Properties;

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
    if (size >= capacity) grow();

    for (int i = size; i > _i; i--) {
      arr[i] = arr[i - 1];
    }
    arr[_i] = _data;
    size++;
  }

  public void delete(Object data) {
    int element = search(data);

    if (element == -1) return;
    
    for (int i = element; i < size; i++) {
      arr[i] = arr[i + 1];
    }
    size--;
    if (size <= (int)(capacity / 3)) shrink();
  }

  public int search(Object data) {
    for (int i = 0; i < size; i++) {
      if (data == arr[i]) return i;
    }
    return -1;
  }

  private void grow() {
    capacity *= 2;

    Object[] newArray = new Object[capacity];
    for (int i = 0; i < size; i++) {
      newArray[i] = arr[i];
    }
    arr = newArray;
  }

  private void shrink() {

  }

  public boolean isEmpty() {
    return size == 0;
  }
  @Override
  public String toString() {
    String str = "[";
    for (int i = 0; i < size; i++) {
      str += arr[i] + ", ";
    }
    return (str.subSequence(0, str.length() - 2) + "]");
  }
}
