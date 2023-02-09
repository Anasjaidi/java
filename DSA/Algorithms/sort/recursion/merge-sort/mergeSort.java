import java.util.Arrays;

public class mergeSort {
  public static void main(String[] args) {
    int[] arr = {9,6,3,1,4,7,5,2,8};
    mergeSort(Arrays.copyOfRange(arr, 0, arr.length / 2), Arrays.copyOfRange(arr, arr.length / 2, arr.length));
  }
  private static void mergeSort(int[] lhs, int[] rhs) {
    System.out.println(Arrays.toString(lhs));
    System.out.println(Arrays.toString(rhs));
    
  }
}
