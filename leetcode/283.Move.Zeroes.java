class Solution {
  public void moveZeroes(int[] nums) {
    int i = 0, j = 0;
    while (i < nums.length - 1 && j < nums.length) {
      if (nums[i] == 0 && nums[j] != 0) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j++;
      } else if (nums[i] == 0 && nums[j] == 0) {
        j++;
      } else {
        i++;
        j++;
      }
    }
    System.out.println(Arrays.toString(nums));
  }
}