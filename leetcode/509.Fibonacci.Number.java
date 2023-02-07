class Solution {
  public int fib(int n) {
    // if (n == 0 || n == 1) return n;
    // return (fib(n - 1) + fib(n - 2));
    return (fibIter(n));
  }

  int fibIter(int n) {
    if (n == 0 || n == 1)
      return n;
    int a = 1, b = 0, c = 0;
    int i = 2;
    while (i <= n) {
      c = a + b;
      b = a;
      a = c;
      i++;
    }
    return c;
  }
}