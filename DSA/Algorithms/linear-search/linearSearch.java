/**
 * linearSearch
 */
public class linearSearch {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9};

    System.out.println("index of 7 in the arr is: "+linearSearch(arr, 7));
    
  }
  private static int linearSearch(int[] arr, int to_find) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == to_find)
        return i;
    }
    return -1;
  }
}