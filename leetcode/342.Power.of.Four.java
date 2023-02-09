class Solution {
  public boolean isPowerOfFour(int n) {
    BigDecimal d = Math.log(n) / Math.log(4);
    return (d == (int) d);
  }
}