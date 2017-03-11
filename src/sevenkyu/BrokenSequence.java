package sevenkyu;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://www.codewars.com/kata/broken-sequence
 */

public class BrokenSequence {
  public int findMissingNumber(String sequence) {
    String newSeq = sequence.replaceAll("[A-Za-z]", "");
    if (newSeq.length() != sequence.length()) return 1;
    if (sequence.isEmpty()) return 0;

    String[] seqArr = sequence.split(" ");
    Arrays.sort(seqArr, new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        return Integer.valueOf(s1).compareTo(Integer.valueOf(s2));
      }
    });
    for (int i = 0; i < seqArr.length; i++) {
      if (!((i + 1) + "").equals(seqArr[i])) {
        return (i + 1);
      }
    }

    return 0;
  }
}