class Solution {
  public boolean isPowerOfFour(int n) {
    double d = Math.log(n) / Math.log(4);
    return (d == (int) d);
  }
}