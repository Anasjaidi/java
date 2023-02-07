public class insertionSort {
  public static void main(String[] args) {
    int[] arr = { 1, 9, 5, 6, 8, 2, 3, 7 };
    insertionSort(arr);
    for (int i = 0; i < arr.length; i++) {

      System.out.println(arr[i]);
    }
  }
  private static void insertionSort(int[]arr) {
    int tmp;

    for (int i = 0; i < arr.length - 1; i++) {
      tmp = arr[i + 1];
      for (int j = i; j >= 0 && arr[j] > tmp; j--) {
        if (arr[j] > tmp) {
          arr[j + 1] = arr[j];
          arr[j] = tmp;
        }
      }
    }
  }
}
