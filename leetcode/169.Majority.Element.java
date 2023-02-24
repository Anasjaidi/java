import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int x: nums) {
            map.putIfAbsent(x, 0);
            map.replace(x, map.get(x) + 1);
        }
        int max = 0, num = 0;
        for (Map.Entry<Integer, Integer> a: map.entrySet()) {
            if (max < a.getValue()) {max = a.getValue(); num = a.getKey();}
        }
        return num;
    }
}