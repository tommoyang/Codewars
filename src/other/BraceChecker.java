package other;

public class BraceChecker {

  public static void main(String[] args) {
    BraceChecker c = new BraceChecker();
    System.out.println(c.isValid("()"));
    System.out.println(c.isValid("[(])"));
  }

  public boolean isValid(String braces) {
    if (braces.length() < 2) return true;

    if ("({[".contains("" + braces.charAt(0))) {
      if ("({[".contains("" + braces.charAt(1))) {
        boolean result = isValid(braces.substring(1));
        if (!result) return false;
      }
    }

    return braces.charAt(1) == opposite(braces.charAt(0));
  }

  private static Character opposite(Character brace) {
    switch(brace) {
      case '(': return ')';
      case '{': return '}';
      case '[': return ']';
      default: return null;
    }
  }

}