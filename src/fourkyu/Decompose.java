package fourkyu;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codewars.com/kata/square-into-squares-protect-trees
 */

public class Decompose {
  public static void main(String[] args) {
    Decompose d = new Decompose();
    System.out.println(d.decompose(11));
  }

  public String decompose(double n) {
    List<Long> list = new ArrayList<>();

    boolean result = decomp(list, n - 1, Math.pow(n, 2));

    String r = "";

    for (int i = 0; i < list.size(); i++) {
      r += list.get(i);

      if (i < list.size() - 1) r += " ";
    }

    return r;
  }

  private boolean decomp(List<Long> results, double n, double max) {
    if (max == 0) return true;
    boolean done = false;
    for (double i = n; i > 0; i--) {
      double pow = Math.pow(i, 2);
      if (pow > max) continue;

      done = decomp(results, i - 1, max - pow);
      if (done) {
        results.add((long) i);
        break;
      }
    }

    return done;
  }
}