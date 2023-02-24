public class selectionSort {
  public static void main(String[] args) {
    int[] arr = { 1, 9, 5, 6, 8, 2, 3, 7 };
    sortMinMax(arr);
    for (int i = 0; i < arr.length; i++) {

      System.out.println(arr[i]);
    }

  }

  private static void selectionSort(int[]arr) {
    int min;
    for (int i = 0; i < arr.length - 1; i++) {
      min = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[min] > arr[j]) min = j;
      }
      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
    }
  }
  
  public static void sortMinMax(int[] arr) {
    int min, max;
    for (int i = 0; i < arr.length / 2; i++) {
      min = i;
      max = arr.length - 1 - i;
      for (int j = i; j <= arr.length - 1 - i; j++) {
        if (arr[j] < arr[min]) min = j;
        if (arr[j] > arr[max]) max =j;
      }
      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
      if (i == max) max = min;
      temp = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = arr[max];
      arr[max] = temp;
    }
      
  }

}

