import java.util.Arrays;

class Solution {
  public int[] sortArray(int[] nums) {
    mergeSort(nums);
    return nums;
  }

  void mergeSort(int[] arr) {
    if (arr.length <= 1)
      return;
    int[] rhs = Arrays.copyOfRange(arr, 0, arr.length / 2), lhs = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
    mergeSort(lhs);
    mergeSort(rhs);
    merge(lhs, rhs, arr);
  }

  void merge(int[] lhs, int[] rhs, int[] arr) {
    int i = 0, l = i, r = i;
    while (l < lhs.length && r < rhs.length) {
      if (lhs[l] < rhs[r])
        arr[i++] = lhs[l++];
      else
        arr[i++] = rhs[r++];
    }
    while (l < lhs.length)
      arr[i++] = lhs[l++];
    while (r < rhs.length)
      arr[i++] = rhs[r++];
  }
}
