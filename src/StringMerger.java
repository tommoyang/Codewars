import static org.junit.Assert.assertTrue;

public class StringMerger {

  public static void main(String[] args) {
    assertTrue(StringMerger.isMerge("Bananas from Bahamas", "Bahas", "Bananas from am"));
    assertTrue(StringMerger.isMerge("_jI&#o\"lQopX\"U/5VU=g\\z", "_jI&oU/5Vg\\z", "#\"lQopX\"U="));
  }

  public static boolean isMerge(String s, String part1, String part2) {
    if (s.length() != (part1.length() + part2.length())) return false;

    for (int i = 0; i < s.length();) {
      String part1bit = "";
      String part2bit = "";

      for (int j = 0; j < part1.length(); j++) {
        if (j > 0 && part1.length() >= j && part2.length() >= j && part1.charAt(j) == part2.charAt(0)) break;
        if (s.charAt(i+j) == part1.charAt(j)) part1bit += part1.charAt(j);
        else break;
      }

      for (int j = 0; j < part2.length(); j++) {
        if (j > 0 && part1.length() >= j && part2.length() >= j && part2.charAt(j) == part1.charAt(0)) break;
        if (s.charAt(i+j) == part2.charAt(j)) part2bit += part2.charAt(j);
        else break;
      }

      if (part1bit.length() > 0 && part1bit.length() > part2bit.length()) {
        s = s.substring(part1bit.length());
        part1 = part1.substring(part1bit.length());
      } else if (part2bit.length() > 0) {
        s = s.substring(part2bit.length());
        part2 = part2.substring(part2bit.length());
      } else {
        return false;
      }
    }

    return true;
  }
}