public class ProdFib { // must be public for codewars

  public static long[] productFib(long prod) {
    long a = 0;
    long b = 0;
    long result = 0;

    for (int i = 0; result < prod; i++) {
      long temp = b;
      b = a + b;
      a = temp;
      result = a * b;
    }

    long[] results = new long[3];
    results[0] = a;
    results[1] = b;
    results[2] = (prod == result ? 1 : 0);

    return results;
  }

  public static int fib(int fib) {
    if (fib == 1 || fib == 0) {
      return fib;
    }

    fib = fib(fib - 1) + fib (fib - 2);

    return fib;
  }
}