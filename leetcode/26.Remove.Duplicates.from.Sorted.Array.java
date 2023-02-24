class Solution {
  public int removeDuplicates(int[] nums) {
    if (nums.length <= 0)
      return 0;
    int start = 0; // 2
    int startAdd = 1; // 1
    while (start < nums.length) {
      if (nums[start] > nums[startAdd - 1]) {
        nums[startAdd] = nums[start];
        startAdd++; // 0
      }
      start++;
    }
    return startAdd;
  }
}