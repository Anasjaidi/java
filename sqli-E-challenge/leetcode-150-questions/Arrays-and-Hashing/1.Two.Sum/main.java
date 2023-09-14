import java.util.Hashtable;


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        int first = -1, second = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target && nums[i] >= 0) continue;
            hash.put(nums[i], i);
        }


        for (int i = 0; i < nums.length; i++) {
            Integer toFind = target - nums[i];
            if (hash.containsKey(toFind) && hash.get(toFind) != i)
                return new int[] {i, hash.get(toFind)};
        }
        

        return null;
    }
}