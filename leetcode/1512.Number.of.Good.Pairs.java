class Solution {
  public int numIdenticalPairs(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int n : nums) {
      if (map.get(n) != null)
        map.put(n, map.get(n) + 1);
      else
        map.put(n, 1);
    }
    int c = 0;
    for (Map.Entry<Integer, Integer> el : map.entrySet()) {
      c += (int) ((el.getValue() * (el.getValue() - 1)) / 2);
    }
    return c;
  }
}