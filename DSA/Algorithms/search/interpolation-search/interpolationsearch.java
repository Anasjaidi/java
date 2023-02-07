import java.util.Arrays;

public class interpolationsearch {
  public static void main(String[] args) {
   int[] arr = new int[(int)1e6];
   for (int i = 0; i < arr.length; i++) {
    arr[i] = i;
   }
  }
  private static int interpolationsearch(long[] arr, long key) {
    int low = 0, high = arr.length;
    while (low <= high && key > arr[low] &&key < arr[high] ) {
      int probe = (int)(low + ((high - low) * (key - arr[low]) / (arr[high] - arr[low])));
      if (key > arr[(int)probe]) low = probe + 1;
      else if (key < arr[(int)probe]) high = probe - 1;
      else return probe;
    }
    return -1;
  }
}
