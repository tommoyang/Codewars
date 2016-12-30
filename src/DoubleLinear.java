import java.util.ArrayList;
import java.util.List;

public class DoubleLinear {
  public static void main(String[] args) {
    System.out.println(dblLinear(100));
  }

  public static int dblLinear (int n) {
    List<Integer> u = new ArrayList<>();
    u.add(1);

    int xy = 0;
    int xz = 0;

    while (u.size() <= n) {
      int y = 2 * u.get(xy) + 1;
      int z = 3 * u.get(xz) + 1;
      if (y <= z && !u.contains(y)) {
        u.add(y);
        xy++; continue;
      }

      if (!u.contains(z)) {
        u.add(z);
      }

      xz++;
    }

    return u.get(n);
  }
}