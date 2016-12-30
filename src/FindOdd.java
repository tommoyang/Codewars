import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindOdd {
  public static int findIt(int[] A) {

    List<Integer> list = new ArrayList<>();

    for (int i : A) {
      list.add(i);
    }

    Collections.sort(list);

    int current = A[0] - 1;
    int count = 0;

    for (int i : list) {
      if (current != i) {
        if (count % 2 == 1)
          return current;
        else {
          current = i;
          count = 0;
        }
      }

      count++;
    }

    return current;
  }
}