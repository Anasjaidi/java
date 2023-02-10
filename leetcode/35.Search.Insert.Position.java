class Solution {
  public int searchInsert(int[] nums, int target) {
    if (target > nums[nums.length - 1])
      return nums.length;
    int low = 0, end = nums.length - 1, mid = 0, ans = 0;
    while (low <= end) {
      mid = (low + end) >> 1;
      if (nums[mid] == target)
        return mid;
      else if (nums[mid] > target)
        end = mid - 1;
      else {
        low = mid + 1;
        ans = mid;
      }
    }
    return mid;
  }
}