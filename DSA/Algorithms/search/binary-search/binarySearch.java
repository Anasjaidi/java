import java.util.Arrays;

/**
 * binarySearch
 */
public class binarySearch {

  public static void main(String[] args) {
    long[] arr = new long[(int)1e6];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = i;
    }
    long startTime , endTime;
  
    startTime = System.nanoTime();
    Arrays.binarySearch(arr, 420000);
    endTime = System.nanoTime();
    System.out.println("external binary search time: "+(endTime - startTime) / 1e6 + " ms");
    
    startTime = System.nanoTime();
    binarySearch(arr, 420000);
    endTime = System.nanoTime();
    System.out.println("internal binary search time: "+(endTime - startTime) / 1e6 + " ms");
    
  }

  public static int binarySearch(long[] arr, long key) {
    int low = 0, high = arr.length;

    while (low <= high) {
      int mid = (low + high) >> 1;
      if (arr[mid] > key) high = mid - 1;
      else if (arr[mid] < key) low = mid + 1;
      else return mid;
    }
    return -1;
  }
}