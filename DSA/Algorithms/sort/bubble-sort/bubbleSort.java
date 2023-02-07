public class bubbleSort {
  public static void main(String[] args) {
    int[] arr = {1,9,5,6,8,2,3,7};
    bubbleSort(arr);
    for (int i = 0; i < arr.length; i++) {
      
      System.out.println(arr[i]);
    }
    
  }

  private static void bubbleSort(int[] arr) {
    for (int i = 0; i < (arr.length - 1); i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          arr[j] = arr[j] + arr[j + 1];
          arr[j + 1] = arr[j] - arr[j + 1];
          arr[j] = arr[j] - arr[j + 1];
        }
      }
    }
  }
}
