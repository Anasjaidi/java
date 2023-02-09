import java.math.BigDecimal;

class Solution {
    public boolean isPowerOfTwo(int n) {
    if (n <= 0) return false;
    return ((n & (n-1)) == (int) 0);
    }
}