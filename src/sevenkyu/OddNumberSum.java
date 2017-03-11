package sevenkyu;

/**
 * https://www.codewars.com/kata/sum-of-odd-numbers
 */

public class OddNumberSum {
  public static void main(String[] args) {
    // 1
    System.out.println(rowSumOddNumbers(1));

    // 3 + 5 = 8
    System.out.println(rowSumOddNumbers(2));

    // 7 + 9 + 11 = 27
    System.out.println(rowSumOddNumbers(3));

    // 13 + 15 + 17 + 19 = 64
    System.out.println(rowSumOddNumbers(4));
  }

  public static int rowSumOddNumbers(int n) {
    double m = n;
    return (int) ((m * m - (m - 1.0)) * m + ((((m - 1.0) / 2.0) * m) * 2.0));
  }

  // 1 2 3 4 5
}