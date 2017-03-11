package sevenkyu;

/**
 * https://www.codewars.com/kata/recursive-reverse-string
 */

public class RecursiveReverseString {

  public static void main(String[] args) {
    System.out.println(reverse("hello world")); //"dlrow olleh" (N = 11)
    System.out.println(reverse("abcd")); //"dcba" (N = 4)
    System.out.println(reverse("12345")); //"54321" (N = 5)
  }

  public static String reverse(String str) {
    char c = str.charAt(0);

    String n = str.substring(1, str.length());
    if (str.length() > 1) {
      n = reverse(n);
    }

    return n + c;
  }
}