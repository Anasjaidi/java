class Solution {
  public int removeElement(int[] nums, int val) {
    if (nums.length <= 0)
      return 0;
    int start = 0; // 2
    int startAdd = 0; // 1
    while (start < nums.length) {
      if (nums[start] != val) {
        nums[startAdd] = nums[start];
        startAdd++; // 0
      }
      start++;
    }
    return startAdd;
  }
}