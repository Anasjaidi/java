import java.util.Arrays;

public class mergeSort {
  public static void main(String[] args) {
    int[] arr = {9,6,3,1,4,7,5,2,8};
    mergeSort(arr);
    System.out.println(Arrays.toString(arr));
    
  }
  private static void mergeSort(int[] arr) {
    if (arr.length <= 1) return;
    int[] lhs = Arrays.copyOfRange(arr, 0, arr.length / 2), rhs = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
    mergeSort(lhs);
    mergeSort(rhs);
    merge(lhs, rhs, arr);
  }
  private static void merge(int[] lhs, int[] rhs, int[] arr) {
    int i = 0, r = i, l = i;
    System.out.println("rhs length: "+rhs.length);
    System.out.println("lhs length: "+lhs.length);
    
    while (l < lhs.length && r < rhs.length) {
      if (lhs[l] < rhs[r]) arr[i++] = lhs[l++];
      else arr[i++] = rhs[r++];
    }
    while (l < lhs.length)
    arr[i++] = lhs[l++];
    while (r < rhs.length)
    arr[i++] = rhs[r++];
    System.out.println(Arrays.toString(arr));
    return;
  }
}
