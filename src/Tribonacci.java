public class Tribonacci {
  public double[] tribonacci(double[] s, int n) {
    if (n == 0) return new double[]{0};
    if (n == 1) return new double[]{s[0]};
    if (n == 2) return new double[]{s[0], s[1]};
    if (n == 3) return s;

    double[] result = new double[n];
    result[0] = s[0];
    result[1] = s[1];
    result[2] = s[2];

    for (int i = 3; i < n; i++)
      result[i] = result[i-3] + result[i-2] + result[i-1];

    return result;
  }
}