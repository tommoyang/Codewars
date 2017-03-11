package sixkyu;

/**
 * https://www.codewars.com/kata/bouncing-balls
 */

public class BouncingBall {
  public static void main(String[] args) {
    System.out.println(bouncingBall(3, 1, 1.5));
  }

  private String[] asdf = {
      "a",
      "a",
      "a",
      "a",
  };

  public static int bouncingBall(double h, double bounce, double window) {
    if (h < window || bounce == 1) return -1;



    int count = 1;

    while (h >= window) {
      h = h * bounce;

      if (h >= window) count++;
    }

    // your code
    return count;
  }
}