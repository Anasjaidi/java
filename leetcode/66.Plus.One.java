import java.math.BigInteger;

class Solution {
  public int[] plusOne(int[] d) {
    int i = -1;
    BigInteger r = BigInteger.ZERO;
    int len = 0;
    int[] rtn_arr = {};

    while (++i < d.length) {
      r = r.multiply(BigInteger.TEN);
      r = r.add(BigInteger.valueOf(d[i]));
    }

    r = r.add(BigInteger.ONE);
    len = r.toString().length();
    rtn_arr = new int[len];
    i = len;

    while (--i >= 0) {
      rtn_arr[i] = (int) (r.mod(BigInteger.TEN).intValue());
      r = r.divide(BigInteger.TEN);
    }

    return rtn_arr;
  }
}